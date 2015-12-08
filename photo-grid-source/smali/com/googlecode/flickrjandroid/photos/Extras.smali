.class public Lcom/googlecode/flickrjandroid/photos/Extras;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final ALL_EXTRAS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final DATE_TAKEN:Ljava/lang/String; = "date_taken"

.field public static final DATE_UPLOAD:Ljava/lang/String; = "date_upload"

.field public static final DESCRIPTION:Ljava/lang/String; = "description"

.field public static final GEO:Ljava/lang/String; = "geo"

.field public static final ICON_SERVER:Ljava/lang/String; = "icon_server"

.field public static final KEY_EXTRAS:Ljava/lang/String; = "extras"

.field public static final LAST_UPDATE:Ljava/lang/String; = "last_update"

.field public static final LICENSE:Ljava/lang/String; = "license"

.field public static final MACHINE_TAGS:Ljava/lang/String; = "machine_tags"

.field public static final MEDIA:Ljava/lang/String; = "media"

.field public static final MIN_EXTRAS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final ORIGINAL_FORMAT:Ljava/lang/String; = "original_format"

.field public static final OWNER_NAME:Ljava/lang/String; = "owner_name"

.field public static final O_DIMS:Ljava/lang/String; = "o_dims"

.field public static final PATH_ALIAS:Ljava/lang/String; = "path_alias"

.field public static final TAGS:Ljava/lang/String; = "tags"

.field public static final URL_L:Ljava/lang/String; = "url_l"

.field public static final URL_M:Ljava/lang/String; = "url_m"

.field public static final URL_O:Ljava/lang/String; = "url_o"

.field public static final URL_Q:Ljava/lang/String; = "url_q"

.field public static final URL_S:Ljava/lang/String; = "url_s"

.field public static final URL_SQ:Ljava/lang/String; = "url_sq"

.field public static final URL_T:Ljava/lang/String; = "url_t"

.field public static final VIEWS:Ljava/lang/String; = "views"

.field public static final serialVersionUID:J = 0xcL


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 64
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    .line 82
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->MIN_EXTRAS:Ljava/util/Set;

    .line 85
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    const-string v1, "date_taken"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 86
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    const-string v1, "date_upload"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 87
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    const-string v1, "icon_server"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 88
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    const-string v1, "last_update"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 89
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    const-string v1, "license"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 90
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    const-string v1, "original_format"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 91
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    const-string v1, "owner_name"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 92
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    const-string v1, "geo"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 93
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    const-string v1, "tags"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 94
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    const-string v1, "machine_tags"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 95
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    const-string v1, "o_dims"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 96
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    const-string v1, "media"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 97
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    const-string v1, "views"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 98
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    const-string v1, "path_alias"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 99
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    const-string v1, "url_s"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 100
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    const-string v1, "url_sq"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 101
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    const-string v1, "url_t"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 102
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    const-string v1, "url_m"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 103
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    const-string v1, "url_o"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 104
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    const-string v1, "url_l"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 105
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    const-string v1, "url_q"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 106
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->ALL_EXTRAS:Ljava/util/Set;

    const-string v1, "description"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 110
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->MIN_EXTRAS:Ljava/util/Set;

    const-string v1, "original_format"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 111
    sget-object v0, Lcom/googlecode/flickrjandroid/photos/Extras;->MIN_EXTRAS:Ljava/util/Set;

    const-string v1, "owner_name"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 112
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    return-void
.end method
