.class public interface abstract Lcom/google/android/gms/games/internal/GamesContract$PlayersColumns;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "PlayersColumns"
.end annotation


# static fields
.field public static final EL:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "external_player_id"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "profile_icon_image_id"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "profile_hi_res_image_id"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "profile_icon_image_uri"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "profile_icon_image_url"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "profile_hi_res_image_uri"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "profile_hi_res_image_url"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "profile_name"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "last_updated"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "is_in_circles"

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/games/internal/GamesContract$PlayersColumns;->EL:[Ljava/lang/String;

    return-void
.end method
