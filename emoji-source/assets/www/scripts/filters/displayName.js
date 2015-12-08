'use strict';

angular.module('displayName', ['usersService'])
    .filter('displayName', function (Users) {
        var isGenderFn = function(gender) {
            return function(user) {
                return parseInt(user.sex, 10) === gender;
            };
        };

        var isMale = isGenderFn(1);

        var isFemale = isGenderFn(2);

        var firstNameAndLastInitial = function(user) {
            var lastName = user.last_name;
            var lastInitial = (lastName) ? ' ' + lastName.charAt(0) : '';
            return user.first_name + lastInitial;
        };

        var samePerson = function(user1, user2) {
            return user1.fb_id == user2.fb_id;
        };

        var reflexivePronounFor = function(user) {
            if ( isMale(user) ) {
                return 'himself';
            } else if (isFemale(user)) {
                return 'herself';
            } else {
                return 'themselves';
            }
        };

        return function (user, isCostar, author) {
            if (!user) {
                return '';
            }

            if (isCostar) {
                if (Users.isMe(user)) {
                    return Users.isMe(author) ? 'yourself' : 'you';
                } else if (samePerson(author, user)) {
                    return reflexivePronounFor(user);
                } else {
                    return firstNameAndLastInitial(user);
                }
            } else {
                // is not costar
                return Users.isMe(user) ? 'You' : firstNameAndLastInitial(user);
            }
        };
    });
