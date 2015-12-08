'use strict';

angular.module('feedShimService', [])
.service('FeedShimService', function ($q, Users) {
	var me = Users.me();
	return {
		direct: $q.when({
			feed_type: 'direct',
			feed_items: [
				{
					item_type: 1,
					item_data: {
						author: me,
						comic_likes: [],
						comic_id: "foo1",
						unread: true,
						comments: [],
						comic_url: '//d2w8mkzmksrerw.cloudfront.net/fb/fbcid318721008-72968285-hq.png',
						costars: [{
							fb_id: 1000080973931419,
							first_name: "Tina",
							name: "Tina At Bitstrips",
							sex: 2,
							thumb: "http://chars.bitstrips.com/profiles/DFPPJS.png?v=4",
							user_id: 72900708
						}],
						timestamp: 1398972291000,
						recipients: [{
							fb_id: 1000080973931419,
							first_name: "Tina",
							name: "Tina At Bitstrips",
							sex: 2,
							thumb: "http://chars.bitstrips.com/profiles/DFPPJS.png?v=4",
							user_id: 72900708
						}
						]
					}
				},
				{
					item_type: 1,
					item_data: {
						author: {
							user_id: 47492698,
							fb_id: 100004354083611,
							name: 'Denis Zaytsev',
							first_name: 'Denis',
							sex: 1,
							thumb: "http://chars.bitstrips.com/profiles/76W0QP.png?v=15"
						},
						comic_caption: "Denis is full of energy!",
						comic_id: "foo2",
						unread: true,
						comic_likes: [],
						comic_url: "//d2w8mkzmksrerw.cloudfront.net/fb/fbcid318751865-47492698-hq.png",
						comments: [],
						costars: [{
							user_id: 47492698,
							fb_id: 100004354083611,
							name: 'Denis Zaytsev',
							first_name: 'Denis',
							sex: 1,
							thumb: "http://chars.bitstrips.com/profiles/76W0QP.png?v=15"
						}],
						timestamp: 1398972291000,
						recipients: [me]
					}
				},
				{
					item_type: 1,
					item_data: {
						author: {
							fb_id: 511184477,
							first_name: "George",
							name: "George W Bones",
							sex: 1,
							thumb: "http://chars.bitstrips.com/profiles/RQKV.png?v=543",
							user_id: 352657
						},
						comic_caption: "",
						comic_id: "foo3",
						unread: false,
						comic_likes: [],
						comic_url: "//d2w8mkzmksrerw.cloudfront.net/fb/fbcid318750397-352657-hq.png",
						comments: [],
						costars: [{
							fb_id: 511184477,
							first_name: "George",
							name: "George W Bones",
							sex: 1,
							thumb: "http://chars.bitstrips.com/profiles/RQKV.png?v=543",
							user_id: 352657
						}],
						timestamp: 1398972036000,
						recipients: [
							me,
							{
								fb_id: 1000080973931419,
								first_name: "Tina",
								name: "Tina At Bitstrips",
								sex: 2,
								thumb: "http://chars.bitstrips.com/profiles/DFPPJS.png?v=4",
								user_id: 72900708
							},
							{
								fb_id: 100002681726399,
								first_name: "John",
								name: "John Ohh",
								sex: 1,
								thumb: "http://chars.bitstrips.com/profiles/Q3T19P.png?v=21",
								user_id: 45411834
							}
						]
					}
				},
				{
					item_type: 1,
					item_data: {
						author: me,
						comic_likes: [],
						comic_id: "foo4",
						unread: true,
						comments: [],
						comic_url: '//d2w8mkzmksrerw.cloudfront.net/fb/fbcid318721008-72968285-hq.png',
						costars: [{
							fb_id: 1000080973931419,
							first_name: "Tina",
							name: "Tina At Bitstrips",
							sex: 2,
							thumb: "http://chars.bitstrips.com/profiles/DFPPJS.png?v=4",
							user_id: 72900708
						}],
						timestamp: 1398972291000,
						recipients: [{
							fb_id: 1000080973931419,
							first_name: "Tina",
							name: "Tina At Bitstrips",
							sex: 2,
							thumb: "http://chars.bitstrips.com/profiles/DFPPJS.png?v=4",
							user_id: 72900708
						},
						{
							fb_id: 100002681726399,
							first_name: "John",
							name: "John Ohh",
							sex: 1,
							thumb: "http://chars.bitstrips.com/profiles/Q3T19P.png?v=21",
							user_id: 45411834
						}
						]
					}
				}
			]

		})
	};
});
