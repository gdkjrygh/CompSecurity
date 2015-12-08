// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;


public final class TwitterMethod extends Enum
{

    private static final TwitterMethod $VALUES[];
    public static final TwitterMethod ACCOUNT_SETTINGS;
    public static final TwitterMethod AVAILABLE_TRENDS;
    public static final TwitterMethod BLOCK_LIST;
    public static final TwitterMethod BLOCK_LIST_IDS;
    public static final TwitterMethod CHECK_LIST_MEMBERSHIP;
    public static final TwitterMethod CHECK_LIST_SUBSCRIPTION;
    public static final TwitterMethod CLOSEST_TRENDS;
    public static final TwitterMethod CONFIGURATION;
    public static final TwitterMethod CONTRIBUTEEES;
    public static final TwitterMethod CONTRIBUTORS;
    public static final TwitterMethod CREATE_BLOCK;
    public static final TwitterMethod CREATE_FAVORITE;
    public static final TwitterMethod CREATE_FRIENDSHIP;
    public static final TwitterMethod CREATE_LIST_MEMBER;
    public static final TwitterMethod CREATE_LIST_MEMBERS;
    public static final TwitterMethod CREATE_MUTE;
    public static final TwitterMethod CREATE_SAVED_SEARCH;
    public static final TwitterMethod CREATE_USER_LIST;
    public static final TwitterMethod DESTROY_BLOCK;
    public static final TwitterMethod DESTROY_DIRECT_MESSAGE;
    public static final TwitterMethod DESTROY_FAVORITE;
    public static final TwitterMethod DESTROY_FRIENDSHIP;
    public static final TwitterMethod DESTROY_LIST_MEMBER;
    public static final TwitterMethod DESTROY_MUTE;
    public static final TwitterMethod DESTROY_SAVED_SEARCH;
    public static final TwitterMethod DESTROY_STATUS;
    public static final TwitterMethod DESTROY_USER_LIST;
    public static final TwitterMethod DIRECT_MESSAGE;
    public static final TwitterMethod DIRECT_MESSAGES;
    public static final TwitterMethod FAVORITES;
    public static final TwitterMethod FOLLOWERS_IDS;
    public static final TwitterMethod FOLLOWERS_LIST;
    public static final TwitterMethod FRIENDS_IDS;
    public static final TwitterMethod FRIENDS_LIST;
    public static final TwitterMethod GEO_DETAILS;
    public static final TwitterMethod HOME_TIMELINE;
    public static final TwitterMethod INCOMING_FRIENDSHIPS;
    public static final TwitterMethod LANGUAGES;
    public static final TwitterMethod LIST_MEMBERS;
    public static final TwitterMethod LIST_SUBSCRIBERS;
    public static final TwitterMethod LOOKUP;
    public static final TwitterMethod LOOKUP_FRIENDSHIPS;
    public static final TwitterMethod LOOKUP_USERS;
    public static final TwitterMethod MEMBER_SUGGESTIONS;
    public static final TwitterMethod MENTIONS_TIMELINE;
    public static final TwitterMethod MUTE_LIST;
    public static final TwitterMethod MUTE_LIST_IDS;
    public static final TwitterMethod OAUTH_ACCESS_TOKEN;
    public static final TwitterMethod OAUTH_REQUEST_TOKEN;
    public static final TwitterMethod OEMBED;
    public static final TwitterMethod OUTGOING_FRIENDSHIPS;
    public static final TwitterMethod PLACE_TRENDS;
    public static final TwitterMethod PRIVACY_POLICY;
    public static final TwitterMethod RATE_LIMIT_STATUS;
    public static final TwitterMethod RELATED_RESULTS;
    public static final TwitterMethod REMOVE_PROFILE_BANNER;
    public static final TwitterMethod REPORT_SPAM;
    public static final TwitterMethod RETWEETS;
    public static final TwitterMethod RETWEETS_OF_ME;
    public static final TwitterMethod RETWEET_STATUS;
    public static final TwitterMethod REVERSE_GEO_CODE;
    public static final TwitterMethod SAVED_SEARCH;
    public static final TwitterMethod SAVED_SEARCHES;
    public static final TwitterMethod SEARCH;
    public static final TwitterMethod SEARCH_PLACES;
    public static final TwitterMethod SEARCH_USERS;
    public static final TwitterMethod SEND_DIRECT_MESSAGE;
    public static final TwitterMethod SENT_DIRECT_MESSAGES;
    public static final TwitterMethod SHOW_FRIENDSHIP;
    public static final TwitterMethod SHOW_STATUS;
    public static final TwitterMethod SHOW_USER;
    public static final TwitterMethod SHOW_USER_LIST;
    public static final TwitterMethod SIMILAR_PLACES;
    public static final TwitterMethod SUBSCRIBE_LIST;
    public static final TwitterMethod SUGGESTED_USER_CATEGORIES;
    public static final TwitterMethod TERMS_OF_SERVICE;
    public static final TwitterMethod UNSUBSCRIBE_LIST;
    public static final TwitterMethod UPDATE_ACCOUNT_SETTINGS;
    public static final TwitterMethod UPDATE_FRIENDSHIP;
    public static final TwitterMethod UPDATE_PROFILE;
    public static final TwitterMethod UPDATE_PROFILE_BACKGROUND_IMAGE;
    public static final TwitterMethod UPDATE_PROFILE_BANNER;
    public static final TwitterMethod UPDATE_PROFILE_COLORS;
    public static final TwitterMethod UPDATE_PROFILE_IMAGE;
    public static final TwitterMethod UPDATE_STATUS;
    public static final TwitterMethod UPDATE_USER_LIST;
    public static final TwitterMethod USER_LISTS;
    public static final TwitterMethod USER_LIST_MEMBERSHIPS;
    public static final TwitterMethod USER_LIST_STATUSES;
    public static final TwitterMethod USER_LIST_SUBSCRIPTIONS;
    public static final TwitterMethod USER_SUGGESTIONS;
    public static final TwitterMethod USER_TIMELINE;
    public static final TwitterMethod VERIFY_CREDENTIALS;

    private TwitterMethod(String s, int i)
    {
        super(s, i);
    }

    public static TwitterMethod valueOf(String s)
    {
        return (TwitterMethod)Enum.valueOf(twitter4j/TwitterMethod, s);
    }

    public static TwitterMethod[] values()
    {
        return (TwitterMethod[])$VALUES.clone();
    }

    static 
    {
        MENTIONS_TIMELINE = new TwitterMethod("MENTIONS_TIMELINE", 0);
        USER_TIMELINE = new TwitterMethod("USER_TIMELINE", 1);
        HOME_TIMELINE = new TwitterMethod("HOME_TIMELINE", 2);
        RETWEETS_OF_ME = new TwitterMethod("RETWEETS_OF_ME", 3);
        RETWEETS = new TwitterMethod("RETWEETS", 4);
        SHOW_STATUS = new TwitterMethod("SHOW_STATUS", 5);
        DESTROY_STATUS = new TwitterMethod("DESTROY_STATUS", 6);
        UPDATE_STATUS = new TwitterMethod("UPDATE_STATUS", 7);
        RETWEET_STATUS = new TwitterMethod("RETWEET_STATUS", 8);
        OEMBED = new TwitterMethod("OEMBED", 9);
        LOOKUP = new TwitterMethod("LOOKUP", 10);
        SEARCH = new TwitterMethod("SEARCH", 11);
        DIRECT_MESSAGES = new TwitterMethod("DIRECT_MESSAGES", 12);
        SENT_DIRECT_MESSAGES = new TwitterMethod("SENT_DIRECT_MESSAGES", 13);
        DIRECT_MESSAGE = new TwitterMethod("DIRECT_MESSAGE", 14);
        DESTROY_DIRECT_MESSAGE = new TwitterMethod("DESTROY_DIRECT_MESSAGE", 15);
        SEND_DIRECT_MESSAGE = new TwitterMethod("SEND_DIRECT_MESSAGE", 16);
        FRIENDS_IDS = new TwitterMethod("FRIENDS_IDS", 17);
        FOLLOWERS_IDS = new TwitterMethod("FOLLOWERS_IDS", 18);
        LOOKUP_FRIENDSHIPS = new TwitterMethod("LOOKUP_FRIENDSHIPS", 19);
        INCOMING_FRIENDSHIPS = new TwitterMethod("INCOMING_FRIENDSHIPS", 20);
        OUTGOING_FRIENDSHIPS = new TwitterMethod("OUTGOING_FRIENDSHIPS", 21);
        CREATE_FRIENDSHIP = new TwitterMethod("CREATE_FRIENDSHIP", 22);
        DESTROY_FRIENDSHIP = new TwitterMethod("DESTROY_FRIENDSHIP", 23);
        UPDATE_FRIENDSHIP = new TwitterMethod("UPDATE_FRIENDSHIP", 24);
        SHOW_FRIENDSHIP = new TwitterMethod("SHOW_FRIENDSHIP", 25);
        FRIENDS_LIST = new TwitterMethod("FRIENDS_LIST", 26);
        FOLLOWERS_LIST = new TwitterMethod("FOLLOWERS_LIST", 27);
        ACCOUNT_SETTINGS = new TwitterMethod("ACCOUNT_SETTINGS", 28);
        VERIFY_CREDENTIALS = new TwitterMethod("VERIFY_CREDENTIALS", 29);
        UPDATE_ACCOUNT_SETTINGS = new TwitterMethod("UPDATE_ACCOUNT_SETTINGS", 30);
        UPDATE_PROFILE = new TwitterMethod("UPDATE_PROFILE", 31);
        UPDATE_PROFILE_BACKGROUND_IMAGE = new TwitterMethod("UPDATE_PROFILE_BACKGROUND_IMAGE", 32);
        UPDATE_PROFILE_COLORS = new TwitterMethod("UPDATE_PROFILE_COLORS", 33);
        UPDATE_PROFILE_IMAGE = new TwitterMethod("UPDATE_PROFILE_IMAGE", 34);
        BLOCK_LIST = new TwitterMethod("BLOCK_LIST", 35);
        BLOCK_LIST_IDS = new TwitterMethod("BLOCK_LIST_IDS", 36);
        CREATE_BLOCK = new TwitterMethod("CREATE_BLOCK", 37);
        DESTROY_BLOCK = new TwitterMethod("DESTROY_BLOCK", 38);
        MUTE_LIST = new TwitterMethod("MUTE_LIST", 39);
        MUTE_LIST_IDS = new TwitterMethod("MUTE_LIST_IDS", 40);
        CREATE_MUTE = new TwitterMethod("CREATE_MUTE", 41);
        DESTROY_MUTE = new TwitterMethod("DESTROY_MUTE", 42);
        SHOW_USER = new TwitterMethod("SHOW_USER", 43);
        LOOKUP_USERS = new TwitterMethod("LOOKUP_USERS", 44);
        SEARCH_USERS = new TwitterMethod("SEARCH_USERS", 45);
        CONTRIBUTORS = new TwitterMethod("CONTRIBUTORS", 46);
        CONTRIBUTEEES = new TwitterMethod("CONTRIBUTEEES", 47);
        REMOVE_PROFILE_BANNER = new TwitterMethod("REMOVE_PROFILE_BANNER", 48);
        UPDATE_PROFILE_BANNER = new TwitterMethod("UPDATE_PROFILE_BANNER", 49);
        RATE_LIMIT_STATUS = new TwitterMethod("RATE_LIMIT_STATUS", 50);
        USER_SUGGESTIONS = new TwitterMethod("USER_SUGGESTIONS", 51);
        SUGGESTED_USER_CATEGORIES = new TwitterMethod("SUGGESTED_USER_CATEGORIES", 52);
        MEMBER_SUGGESTIONS = new TwitterMethod("MEMBER_SUGGESTIONS", 53);
        FAVORITES = new TwitterMethod("FAVORITES", 54);
        DESTROY_FAVORITE = new TwitterMethod("DESTROY_FAVORITE", 55);
        CREATE_FAVORITE = new TwitterMethod("CREATE_FAVORITE", 56);
        USER_LISTS = new TwitterMethod("USER_LISTS", 57);
        USER_LIST_STATUSES = new TwitterMethod("USER_LIST_STATUSES", 58);
        DESTROY_LIST_MEMBER = new TwitterMethod("DESTROY_LIST_MEMBER", 59);
        USER_LIST_MEMBERSHIPS = new TwitterMethod("USER_LIST_MEMBERSHIPS", 60);
        LIST_SUBSCRIBERS = new TwitterMethod("LIST_SUBSCRIBERS", 61);
        SUBSCRIBE_LIST = new TwitterMethod("SUBSCRIBE_LIST", 62);
        CHECK_LIST_SUBSCRIPTION = new TwitterMethod("CHECK_LIST_SUBSCRIPTION", 63);
        UNSUBSCRIBE_LIST = new TwitterMethod("UNSUBSCRIBE_LIST", 64);
        CREATE_LIST_MEMBERS = new TwitterMethod("CREATE_LIST_MEMBERS", 65);
        CHECK_LIST_MEMBERSHIP = new TwitterMethod("CHECK_LIST_MEMBERSHIP", 66);
        LIST_MEMBERS = new TwitterMethod("LIST_MEMBERS", 67);
        CREATE_LIST_MEMBER = new TwitterMethod("CREATE_LIST_MEMBER", 68);
        DESTROY_USER_LIST = new TwitterMethod("DESTROY_USER_LIST", 69);
        UPDATE_USER_LIST = new TwitterMethod("UPDATE_USER_LIST", 70);
        CREATE_USER_LIST = new TwitterMethod("CREATE_USER_LIST", 71);
        SHOW_USER_LIST = new TwitterMethod("SHOW_USER_LIST", 72);
        USER_LIST_SUBSCRIPTIONS = new TwitterMethod("USER_LIST_SUBSCRIPTIONS", 73);
        SAVED_SEARCHES = new TwitterMethod("SAVED_SEARCHES", 74);
        SAVED_SEARCH = new TwitterMethod("SAVED_SEARCH", 75);
        CREATE_SAVED_SEARCH = new TwitterMethod("CREATE_SAVED_SEARCH", 76);
        DESTROY_SAVED_SEARCH = new TwitterMethod("DESTROY_SAVED_SEARCH", 77);
        SEARCH_PLACES = new TwitterMethod("SEARCH_PLACES", 78);
        SIMILAR_PLACES = new TwitterMethod("SIMILAR_PLACES", 79);
        REVERSE_GEO_CODE = new TwitterMethod("REVERSE_GEO_CODE", 80);
        GEO_DETAILS = new TwitterMethod("GEO_DETAILS", 81);
        PLACE_TRENDS = new TwitterMethod("PLACE_TRENDS", 82);
        AVAILABLE_TRENDS = new TwitterMethod("AVAILABLE_TRENDS", 83);
        CLOSEST_TRENDS = new TwitterMethod("CLOSEST_TRENDS", 84);
        REPORT_SPAM = new TwitterMethod("REPORT_SPAM", 85);
        OAUTH_REQUEST_TOKEN = new TwitterMethod("OAUTH_REQUEST_TOKEN", 86);
        OAUTH_ACCESS_TOKEN = new TwitterMethod("OAUTH_ACCESS_TOKEN", 87);
        TERMS_OF_SERVICE = new TwitterMethod("TERMS_OF_SERVICE", 88);
        CONFIGURATION = new TwitterMethod("CONFIGURATION", 89);
        LANGUAGES = new TwitterMethod("LANGUAGES", 90);
        PRIVACY_POLICY = new TwitterMethod("PRIVACY_POLICY", 91);
        RELATED_RESULTS = new TwitterMethod("RELATED_RESULTS", 92);
        $VALUES = (new TwitterMethod[] {
            MENTIONS_TIMELINE, USER_TIMELINE, HOME_TIMELINE, RETWEETS_OF_ME, RETWEETS, SHOW_STATUS, DESTROY_STATUS, UPDATE_STATUS, RETWEET_STATUS, OEMBED, 
            LOOKUP, SEARCH, DIRECT_MESSAGES, SENT_DIRECT_MESSAGES, DIRECT_MESSAGE, DESTROY_DIRECT_MESSAGE, SEND_DIRECT_MESSAGE, FRIENDS_IDS, FOLLOWERS_IDS, LOOKUP_FRIENDSHIPS, 
            INCOMING_FRIENDSHIPS, OUTGOING_FRIENDSHIPS, CREATE_FRIENDSHIP, DESTROY_FRIENDSHIP, UPDATE_FRIENDSHIP, SHOW_FRIENDSHIP, FRIENDS_LIST, FOLLOWERS_LIST, ACCOUNT_SETTINGS, VERIFY_CREDENTIALS, 
            UPDATE_ACCOUNT_SETTINGS, UPDATE_PROFILE, UPDATE_PROFILE_BACKGROUND_IMAGE, UPDATE_PROFILE_COLORS, UPDATE_PROFILE_IMAGE, BLOCK_LIST, BLOCK_LIST_IDS, CREATE_BLOCK, DESTROY_BLOCK, MUTE_LIST, 
            MUTE_LIST_IDS, CREATE_MUTE, DESTROY_MUTE, SHOW_USER, LOOKUP_USERS, SEARCH_USERS, CONTRIBUTORS, CONTRIBUTEEES, REMOVE_PROFILE_BANNER, UPDATE_PROFILE_BANNER, 
            RATE_LIMIT_STATUS, USER_SUGGESTIONS, SUGGESTED_USER_CATEGORIES, MEMBER_SUGGESTIONS, FAVORITES, DESTROY_FAVORITE, CREATE_FAVORITE, USER_LISTS, USER_LIST_STATUSES, DESTROY_LIST_MEMBER, 
            USER_LIST_MEMBERSHIPS, LIST_SUBSCRIBERS, SUBSCRIBE_LIST, CHECK_LIST_SUBSCRIPTION, UNSUBSCRIBE_LIST, CREATE_LIST_MEMBERS, CHECK_LIST_MEMBERSHIP, LIST_MEMBERS, CREATE_LIST_MEMBER, DESTROY_USER_LIST, 
            UPDATE_USER_LIST, CREATE_USER_LIST, SHOW_USER_LIST, USER_LIST_SUBSCRIPTIONS, SAVED_SEARCHES, SAVED_SEARCH, CREATE_SAVED_SEARCH, DESTROY_SAVED_SEARCH, SEARCH_PLACES, SIMILAR_PLACES, 
            REVERSE_GEO_CODE, GEO_DETAILS, PLACE_TRENDS, AVAILABLE_TRENDS, CLOSEST_TRENDS, REPORT_SPAM, OAUTH_REQUEST_TOKEN, OAUTH_ACCESS_TOKEN, TERMS_OF_SERVICE, CONFIGURATION, 
            LANGUAGES, PRIVACY_POLICY, RELATED_RESULTS
        });
    }
}
