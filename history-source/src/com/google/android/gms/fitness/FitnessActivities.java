// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness;

import android.util.SparseArray;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.fitness.data.Value;

public class FitnessActivities
{

    public static final String AEROBICS = "aerobics";
    public static final String BADMINTON = "badminton";
    public static final String BASEBALL = "baseball";
    public static final String BASKETBALL = "basketball";
    public static final String BIATHLON = "biathlon";
    public static final String BIKING = "biking";
    public static final String BIKING_HAND = "biking.hand";
    public static final String BIKING_MOUNTAIN = "biking.mountain";
    public static final String BIKING_ROAD = "biking.road";
    public static final String BIKING_SPINNING = "biking.spinning";
    public static final String BIKING_STATIONARY = "biking.stationary";
    public static final String BIKING_UTILITY = "biking.utility";
    public static final String BOXING = "boxing";
    public static final String CALISTHENICS = "calisthenics";
    public static final String CIRCUIT_TRAINING = "circuit_training";
    public static final String CRICKET = "cricket";
    public static final String CURLING = "curling";
    public static final String DANCING = "dancing";
    public static final String DIVING = "diving";
    public static final String ELLIPTICAL = "elliptical";
    public static final String ERGOMETER = "ergometer";
    public static final String EXTRA_STATUS = "actionStatus";
    public static final String FENCING = "fencing";
    public static final String FOOTBALL_AMERICAN = "football.american";
    public static final String FOOTBALL_AUSTRALIAN = "football.australian";
    public static final String FOOTBALL_SOCCER = "football.soccer";
    public static final String FRISBEE_DISC = "frisbee_disc";
    public static final String GARDENING = "gardening";
    public static final String GOLF = "golf";
    public static final String GYMNASTICS = "gymnastics";
    public static final String HANDBALL = "handball";
    public static final String HIKING = "hiking";
    public static final String HOCKEY = "hockey";
    public static final String HORSEBACK_RIDING = "horseback_riding";
    public static final String HOUSEWORK = "housework";
    public static final String ICE_SKATING = "ice_skating";
    public static final String IN_VEHICLE = "in_vehicle";
    public static final String JUMP_ROPE = "jump_rope";
    public static final String KAYAKING = "kayaking";
    public static final String KETTLEBELL_TRAINING = "kettlebell_training";
    public static final String KICKBOXING = "kickboxing";
    public static final String KICK_SCOOTER = "kick_scooter";
    public static final String KITESURFING = "kitesurfing";
    public static final String MARTIAL_ARTS = "martial_arts";
    public static final String MEDITATION = "meditation";
    public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.activity/";
    public static final String MIXED_MARTIAL_ARTS = "martial_arts.mixed";
    public static final String ON_FOOT = "on_foot";
    public static final String OTHER = "other";
    public static final String P90X = "p90x";
    public static final String PARAGLIDING = "paragliding";
    public static final String PILATES = "pilates";
    public static final String POLO = "polo";
    public static final String RACQUETBALL = "racquetball";
    public static final String ROCK_CLIMBING = "rock_climbing";
    public static final String ROWING = "rowing";
    public static final String ROWING_MACHINE = "rowing.machine";
    public static final String RUGBY = "rugby";
    public static final String RUNNING = "running";
    public static final String RUNNING_JOGGING = "running.jogging";
    public static final String RUNNING_SAND = "running.sand";
    public static final String RUNNING_TREADMILL = "running.treadmill";
    public static final String SAILING = "sailing";
    public static final String SCUBA_DIVING = "scuba_diving";
    public static final String SKATEBOARDING = "skateboarding";
    public static final String SKATING = "skating";
    public static final String SKATING_CROSS = "skating.cross";
    public static final String SKATING_INDOOR = "skating.indoor";
    public static final String SKATING_INLINE = "skating.inline";
    public static final String SKIING = "skiing";
    public static final String SKIING_BACK_COUNTRY = "skiing.back_country";
    public static final String SKIING_CROSS_COUNTRY = "skiing.cross_country";
    public static final String SKIING_DOWNHILL = "skiing.downhill";
    public static final String SKIING_KITE = "skiing.kite";
    public static final String SKIING_ROLLER = "skiing.roller";
    public static final String SLEDDING = "sledding";
    public static final String SLEEP = "sleep";
    public static final String SNOWBOARDING = "snowboarding";
    public static final String SNOWMOBILE = "snowmobile";
    public static final String SNOWSHOEING = "snowshoeing";
    public static final String SQUASH = "squash";
    public static final String STAIR_CLIMBING = "stair_climbing";
    public static final String STAIR_CLIMBING_MACHINE = "stair_climbing.machine";
    public static final String STANDUP_PADDLEBOARDING = "standup_paddleboarding";
    public static final String STATUS_ACTIVE = "ActiveActionStatus";
    public static final String STATUS_COMPLETED = "CompletedActionStatus";
    public static final String STILL = "still";
    public static final String STRENGTH_TRAINING = "strength_training";
    public static final String SURFING = "surfing";
    public static final String SWIMMING = "swimming";
    public static final String SWIMMING_OPEN_WATER = "swimming.open_water";
    public static final String SWIMMING_POOL = "swimming.pool";
    public static final String TABLE_TENNIS = "table_tennis";
    public static final String TEAM_SPORTS = "team_sports";
    public static final String TENNIS = "tennis";
    public static final String TILTING = "tilting";
    private static final SparseArray TL;
    public static final String TREADMILL = "treadmill";
    public static final String UNKNOWN = "unknown";
    public static final String VOLLEYBALL = "volleyball";
    public static final String VOLLEYBALL_BEACH = "volleyball.beach";
    public static final String VOLLEYBALL_INDOOR = "volleyball.indoor";
    public static final String WAKEBOARDING = "wakeboarding";
    public static final String WALKING = "walking";
    public static final String WALKING_FITNESS = "walking.fitness";
    public static final String WALKING_NORDIC = "walking.nordic";
    public static final String WALKING_TREADMILL = "walking.treadmill";
    public static final String WATER_POLO = "water_polo";
    public static final String WEIGHTLIFTING = "weightlifting";
    public static final String WHEELCHAIR = "wheelchair";
    public static final String WINDSURFING = "windsurfing";
    public static final String YOGA = "yoga";
    public static final String ZUMBA = "zumba";

    FitnessActivities()
    {
    }

    public static int bs(String s)
    {
        int i = TL.indexOfValue(s);
        if (i >= 0)
        {
            if ((i = TL.keyAt(i)) <= 108)
            {
                return i;
            }
        }
        return 4;
    }

    public static String getMimeType(String s)
    {
        return (new StringBuilder()).append("vnd.google.fitness.activity/").append(s).toString();
    }

    public static String getName(int i)
    {
        String s = (String)TL.get(i);
        if (s == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown activity ").append(i).toString());
        } else
        {
            return s;
        }
    }

    public static String getValue(DataPoint datapoint)
    {
        return datapoint.getValue(Field.FIELD_ACTIVITY).asActivity();
    }

    public static void setValue(DataPoint datapoint, String s)
    {
        datapoint.getValue(Field.FIELD_ACTIVITY).setActivity(s);
    }

    static 
    {
        TL = new SparseArray(109);
        TL.put(9, "aerobics");
        TL.put(10, "badminton");
        TL.put(11, "baseball");
        TL.put(12, "basketball");
        TL.put(13, "biathlon");
        TL.put(1, "biking");
        TL.put(14, "biking.hand");
        TL.put(15, "biking.mountain");
        TL.put(16, "biking.road");
        TL.put(17, "biking.spinning");
        TL.put(18, "biking.stationary");
        TL.put(19, "biking.utility");
        TL.put(20, "boxing");
        TL.put(21, "calisthenics");
        TL.put(22, "circuit_training");
        TL.put(23, "cricket");
        TL.put(106, "curling");
        TL.put(24, "dancing");
        TL.put(102, "diving");
        TL.put(25, "elliptical");
        TL.put(103, "ergometer");
        TL.put(6, "exiting_vehicle");
        TL.put(26, "fencing");
        TL.put(27, "football.american");
        TL.put(28, "football.australian");
        TL.put(29, "football.soccer");
        TL.put(30, "frisbee_disc");
        TL.put(31, "gardening");
        TL.put(32, "golf");
        TL.put(33, "gymnastics");
        TL.put(34, "handball");
        TL.put(35, "hiking");
        TL.put(36, "hockey");
        TL.put(37, "horseback_riding");
        TL.put(38, "housework");
        TL.put(104, "ice_skating");
        TL.put(0, "in_vehicle");
        TL.put(39, "jump_rope");
        TL.put(40, "kayaking");
        TL.put(41, "kettlebell_training");
        TL.put(107, "kick_scooter");
        TL.put(42, "kickboxing");
        TL.put(43, "kitesurfing");
        TL.put(44, "martial_arts");
        TL.put(45, "meditation");
        TL.put(46, "martial_arts.mixed");
        TL.put(2, "on_foot");
        TL.put(108, "other");
        TL.put(47, "p90x");
        TL.put(48, "paragliding");
        TL.put(49, "pilates");
        TL.put(50, "polo");
        TL.put(51, "racquetball");
        TL.put(52, "rock_climbing");
        TL.put(53, "rowing");
        TL.put(54, "rowing.machine");
        TL.put(55, "rugby");
        TL.put(8, "running");
        TL.put(56, "running.jogging");
        TL.put(57, "running.sand");
        TL.put(58, "running.treadmill");
        TL.put(59, "sailing");
        TL.put(60, "scuba_diving");
        TL.put(61, "skateboarding");
        TL.put(62, "skating");
        TL.put(63, "skating.cross");
        TL.put(105, "skating.indoor");
        TL.put(64, "skating.inline");
        TL.put(65, "skiing");
        TL.put(66, "skiing.back_country");
        TL.put(67, "skiing.cross_country");
        TL.put(68, "skiing.downhill");
        TL.put(69, "skiing.kite");
        TL.put(70, "skiing.roller");
        TL.put(71, "sledding");
        TL.put(72, "sleep");
        TL.put(73, "snowboarding");
        TL.put(74, "snowmobile");
        TL.put(75, "snowshoeing");
        TL.put(76, "squash");
        TL.put(77, "stair_climbing");
        TL.put(78, "stair_climbing.machine");
        TL.put(79, "standup_paddleboarding");
        TL.put(3, "still");
        TL.put(80, "strength_training");
        TL.put(81, "surfing");
        TL.put(82, "swimming");
        TL.put(83, "swimming.pool");
        TL.put(84, "swimming.open_water");
        TL.put(85, "table_tennis");
        TL.put(86, "team_sports");
        TL.put(87, "tennis");
        TL.put(5, "tilting");
        TL.put(88, "treadmill");
        TL.put(4, "unknown");
        TL.put(89, "volleyball");
        TL.put(90, "volleyball.beach");
        TL.put(91, "volleyball.indoor");
        TL.put(92, "wakeboarding");
        TL.put(7, "walking");
        TL.put(93, "walking.fitness");
        TL.put(94, "walking.nordic");
        TL.put(95, "walking.treadmill");
        TL.put(96, "water_polo");
        TL.put(97, "weightlifting");
        TL.put(98, "wheelchair");
        TL.put(99, "windsurfing");
        TL.put(100, "yoga");
        TL.put(101, "zumba");
    }
}
