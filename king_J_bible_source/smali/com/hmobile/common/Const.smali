.class public Lcom/hmobile/common/Const;
.super Ljava/lang/Object;
.source "Const.java"


# static fields
.field public static final BOOK_MARK_COLOR:Ljava/lang/String; = "BOOKMARKCOLOR"

.field public static final DATABASE_NAME:Ljava/lang/String; = "hmobile.db"

.field public static final DATABASE_VERSION:I = 0x3

.field public static final FONT_SIZE:Ljava/lang/String; = "font_size"

.field public static final FONT_STYLE:Ljava/lang/String; = "font_style"

.field public static final LOCAL_DATABASE_NAME:Ljava/lang/String; = "localhmobile.db"

.field public static final LOCAL_DATABASE_VERSION:I = 0x1

.field public static final LOWLIGHT:Ljava/lang/String; = "low_light"

.field public static final NAVIGATION_FADE:Ljava/lang/String; = "navigation_fade"

.field public static final RED_LETTER:Ljava/lang/String; = "red_letter"

.field public static final SHOW_NOTES:Ljava/lang/String; = "show_notes"

.field public static final SHOW_VERSE_PICKER:Ljava/lang/String; = "show_verse_picker"

.field public static final SPEECH_PITCH:Ljava/lang/String; = "speech_pitch"

.field public static final SPEECH_SPEED:Ljava/lang/String; = "speech_speed"

.field public static final TAG:Ljava/lang/String; = "HMOBILE"

.field public static final TWITTER_ACCESS_KEY:Ljava/lang/String; = "accessKey"

.field public static final TWITTER_ACCESS_SECRET:Ljava/lang/String; = "accessSecret"

.field public static final WIDGET_FONT_SIZE:Ljava/lang/String; = "widget_font_size"

.field public static final WIDGET_FONT_STYLE:Ljava/lang/String; = "widget_font_style"

.field public static final WIDGET_LOWLIGHT:Ljava/lang/String; = "widget_low_light"

.field public static final WIDGET_UPDATE_DURATION:Ljava/lang/String; = "widget_update_duration"

.field public static isTweetSet:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x0

    sput-boolean v0, Lcom/hmobile/common/Const;->isTweetSet:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
