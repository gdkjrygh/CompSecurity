.class public final Lcom/google/android/gms/internal/ic;
.super Lcom/google/android/gms/internal/ga;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;
.implements Lcom/google/android/gms/plus/model/moments/ItemScope;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/id;

.field private static final UI:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ga$a",
            "<**>;>;"
        }
    .end annotation
.end field


# instance fields
.field private HD:Ljava/lang/String;

.field private NX:D

.field private NY:D

.field private Rd:Ljava/lang/String;

.field private final UJ:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private UK:Lcom/google/android/gms/internal/ic;

.field private UL:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private UM:Lcom/google/android/gms/internal/ic;

.field private UN:Ljava/lang/String;

.field private UO:Ljava/lang/String;

.field private UP:Ljava/lang/String;

.field private UQ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ic;",
            ">;"
        }
    .end annotation
.end field

.field private UR:I

.field private US:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ic;",
            ">;"
        }
    .end annotation
.end field

.field private UT:Lcom/google/android/gms/internal/ic;

.field private UU:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ic;",
            ">;"
        }
    .end annotation
.end field

.field private UV:Ljava/lang/String;

.field private UW:Ljava/lang/String;

.field private UX:Lcom/google/android/gms/internal/ic;

.field private UY:Ljava/lang/String;

.field private UZ:Ljava/lang/String;

.field private VA:Ljava/lang/String;

.field private VB:Ljava/lang/String;

.field private VC:Ljava/lang/String;

.field private VD:Ljava/lang/String;

.field private Va:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ic;",
            ">;"
        }
    .end annotation
.end field

.field private Vb:Ljava/lang/String;

.field private Vc:Ljava/lang/String;

.field private Vd:Ljava/lang/String;

.field private Ve:Ljava/lang/String;

.field private Vf:Ljava/lang/String;

.field private Vg:Ljava/lang/String;

.field private Vh:Ljava/lang/String;

.field private Vi:Ljava/lang/String;

.field private Vj:Lcom/google/android/gms/internal/ic;

.field private Vk:Ljava/lang/String;

.field private Vl:Ljava/lang/String;

.field private Vm:Ljava/lang/String;

.field private Vn:Lcom/google/android/gms/internal/ic;

.field private Vo:Lcom/google/android/gms/internal/ic;

.field private Vp:Lcom/google/android/gms/internal/ic;

.field private Vq:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ic;",
            ">;"
        }
    .end annotation
.end field

.field private Vr:Ljava/lang/String;

.field private Vs:Ljava/lang/String;

.field private Vt:Ljava/lang/String;

.field private Vu:Ljava/lang/String;

.field private Vv:Lcom/google/android/gms/internal/ic;

.field private Vw:Ljava/lang/String;

.field private Vx:Ljava/lang/String;

.field private Vy:Ljava/lang/String;

.field private Vz:Lcom/google/android/gms/internal/ic;

.field private lY:Ljava/lang/String;

.field private mName:Ljava/lang/String;

.field private ro:Ljava/lang/String;

.field private wp:Ljava/lang/String;

.field private final xH:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/id;

    invoke-direct {v0}, Lcom/google/android/gms/internal/id;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ic;->CREATOR:Lcom/google/android/gms/internal/id;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "about"

    const-string v2, "about"

    const/4 v3, 0x2

    const-class v4, Lcom/google/android/gms/internal/ic;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ga$a;->a(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "additionalName"

    const-string v2, "additionalName"

    const/4 v3, 0x3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->k(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "address"

    const-string v2, "address"

    const/4 v3, 0x4

    const-class v4, Lcom/google/android/gms/internal/ic;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ga$a;->a(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "addressCountry"

    const-string v2, "addressCountry"

    const/4 v3, 0x5

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "addressLocality"

    const-string v2, "addressLocality"

    const/4 v3, 0x6

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "addressRegion"

    const-string v2, "addressRegion"

    const/4 v3, 0x7

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "associated_media"

    const-string v2, "associated_media"

    const/16 v3, 0x8

    const-class v4, Lcom/google/android/gms/internal/ic;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ga$a;->b(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "attendeeCount"

    const-string v2, "attendeeCount"

    const/16 v3, 0x9

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->g(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "attendees"

    const-string v2, "attendees"

    const/16 v3, 0xa

    const-class v4, Lcom/google/android/gms/internal/ic;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ga$a;->b(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "audio"

    const-string v2, "audio"

    const/16 v3, 0xb

    const-class v4, Lcom/google/android/gms/internal/ic;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ga$a;->a(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "author"

    const-string v2, "author"

    const/16 v3, 0xc

    const-class v4, Lcom/google/android/gms/internal/ic;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ga$a;->b(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "bestRating"

    const-string v2, "bestRating"

    const/16 v3, 0xd

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "birthDate"

    const-string v2, "birthDate"

    const/16 v3, 0xe

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "byArtist"

    const-string v2, "byArtist"

    const/16 v3, 0xf

    const-class v4, Lcom/google/android/gms/internal/ic;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ga$a;->a(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "caption"

    const-string v2, "caption"

    const/16 v3, 0x10

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "contentSize"

    const-string v2, "contentSize"

    const/16 v3, 0x11

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "contentUrl"

    const-string v2, "contentUrl"

    const/16 v3, 0x12

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "contributor"

    const-string v2, "contributor"

    const/16 v3, 0x13

    const-class v4, Lcom/google/android/gms/internal/ic;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ga$a;->b(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "dateCreated"

    const-string v2, "dateCreated"

    const/16 v3, 0x14

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "dateModified"

    const-string v2, "dateModified"

    const/16 v3, 0x15

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "datePublished"

    const-string v2, "datePublished"

    const/16 v3, 0x16

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "description"

    const-string v2, "description"

    const/16 v3, 0x17

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "duration"

    const-string v2, "duration"

    const/16 v3, 0x18

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "embedUrl"

    const-string v2, "embedUrl"

    const/16 v3, 0x19

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "endDate"

    const-string v2, "endDate"

    const/16 v3, 0x1a

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "familyName"

    const-string v2, "familyName"

    const/16 v3, 0x1b

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "gender"

    const-string v2, "gender"

    const/16 v3, 0x1c

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "geo"

    const-string v2, "geo"

    const/16 v3, 0x1d

    const-class v4, Lcom/google/android/gms/internal/ic;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ga$a;->a(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "givenName"

    const-string v2, "givenName"

    const/16 v3, 0x1e

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "height"

    const-string v2, "height"

    const/16 v3, 0x1f

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "id"

    const-string v2, "id"

    const/16 v3, 0x20

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "image"

    const-string v2, "image"

    const/16 v3, 0x21

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "inAlbum"

    const-string v2, "inAlbum"

    const/16 v3, 0x22

    const-class v4, Lcom/google/android/gms/internal/ic;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ga$a;->a(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "latitude"

    const-string v2, "latitude"

    const/16 v3, 0x24

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->h(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "location"

    const-string v2, "location"

    const/16 v3, 0x25

    const-class v4, Lcom/google/android/gms/internal/ic;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ga$a;->a(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "longitude"

    const-string v2, "longitude"

    const/16 v3, 0x26

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->h(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "name"

    const-string v2, "name"

    const/16 v3, 0x27

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "partOfTVSeries"

    const-string v2, "partOfTVSeries"

    const/16 v3, 0x28

    const-class v4, Lcom/google/android/gms/internal/ic;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ga$a;->a(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "performers"

    const-string v2, "performers"

    const/16 v3, 0x29

    const-class v4, Lcom/google/android/gms/internal/ic;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ga$a;->b(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "playerType"

    const-string v2, "playerType"

    const/16 v3, 0x2a

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "postOfficeBoxNumber"

    const-string v2, "postOfficeBoxNumber"

    const/16 v3, 0x2b

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "postalCode"

    const-string v2, "postalCode"

    const/16 v3, 0x2c

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "ratingValue"

    const-string v2, "ratingValue"

    const/16 v3, 0x2d

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "reviewRating"

    const-string v2, "reviewRating"

    const/16 v3, 0x2e

    const-class v4, Lcom/google/android/gms/internal/ic;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ga$a;->a(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "startDate"

    const-string v2, "startDate"

    const/16 v3, 0x2f

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "streetAddress"

    const-string v2, "streetAddress"

    const/16 v3, 0x30

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "text"

    const-string v2, "text"

    const/16 v3, 0x31

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "thumbnail"

    const-string v2, "thumbnail"

    const/16 v3, 0x32

    const-class v4, Lcom/google/android/gms/internal/ic;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ga$a;->a(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "thumbnailUrl"

    const-string v2, "thumbnailUrl"

    const/16 v3, 0x33

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "tickerSymbol"

    const-string v2, "tickerSymbol"

    const/16 v3, 0x34

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "type"

    const-string v2, "type"

    const/16 v3, 0x35

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "url"

    const-string v2, "url"

    const/16 v3, 0x36

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "width"

    const-string v2, "width"

    const/16 v3, 0x37

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    const-string v1, "worstRating"

    const-string v2, "worstRating"

    const/16 v3, 0x38

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ga$a;->j(Ljava/lang/String;I)Lcom/google/android/gms/internal/ga$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ga;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ic;->xH:I

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    return-void
.end method

.method constructor <init>(Ljava/util/Set;ILcom/google/android/gms/internal/ic;Ljava/util/List;Lcom/google/android/gms/internal/ic;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;Lcom/google/android/gms/internal/ic;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ic;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ic;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ic;DLcom/google/android/gms/internal/ic;DLjava/lang/String;Lcom/google/android/gms/internal/ic;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ic;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ic;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;I",
            "Lcom/google/android/gms/internal/ic;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/internal/ic;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ic;",
            ">;I",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ic;",
            ">;",
            "Lcom/google/android/gms/internal/ic;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ic;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ic;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ic;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ic;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ic;",
            "D",
            "Lcom/google/android/gms/internal/ic;",
            "D",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ic;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ic;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ic;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ic;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ga;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    iput p2, p0, Lcom/google/android/gms/internal/ic;->xH:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ic;->UK:Lcom/google/android/gms/internal/ic;

    iput-object p4, p0, Lcom/google/android/gms/internal/ic;->UL:Ljava/util/List;

    iput-object p5, p0, Lcom/google/android/gms/internal/ic;->UM:Lcom/google/android/gms/internal/ic;

    iput-object p6, p0, Lcom/google/android/gms/internal/ic;->UN:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/ic;->UO:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/internal/ic;->UP:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/internal/ic;->UQ:Ljava/util/List;

    iput p10, p0, Lcom/google/android/gms/internal/ic;->UR:I

    iput-object p11, p0, Lcom/google/android/gms/internal/ic;->US:Ljava/util/List;

    iput-object p12, p0, Lcom/google/android/gms/internal/ic;->UT:Lcom/google/android/gms/internal/ic;

    iput-object p13, p0, Lcom/google/android/gms/internal/ic;->UU:Ljava/util/List;

    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->UV:Ljava/lang/String;

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->UW:Ljava/lang/String;

    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->UX:Lcom/google/android/gms/internal/ic;

    move-object/from16 v0, p17

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->UY:Ljava/lang/String;

    move-object/from16 v0, p18

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->UZ:Ljava/lang/String;

    move-object/from16 v0, p19

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->lY:Ljava/lang/String;

    move-object/from16 v0, p20

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Va:Ljava/util/List;

    move-object/from16 v0, p21

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vb:Ljava/lang/String;

    move-object/from16 v0, p22

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vc:Ljava/lang/String;

    move-object/from16 v0, p23

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vd:Ljava/lang/String;

    move-object/from16 v0, p24

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->HD:Ljava/lang/String;

    move-object/from16 v0, p25

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Ve:Ljava/lang/String;

    move-object/from16 v0, p26

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vf:Ljava/lang/String;

    move-object/from16 v0, p27

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vg:Ljava/lang/String;

    move-object/from16 v0, p28

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vh:Ljava/lang/String;

    move-object/from16 v0, p29

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vi:Ljava/lang/String;

    move-object/from16 v0, p30

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vj:Lcom/google/android/gms/internal/ic;

    move-object/from16 v0, p31

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vk:Ljava/lang/String;

    move-object/from16 v0, p32

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vl:Ljava/lang/String;

    move-object/from16 v0, p33

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->wp:Ljava/lang/String;

    move-object/from16 v0, p34

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vm:Ljava/lang/String;

    move-object/from16 v0, p35

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vn:Lcom/google/android/gms/internal/ic;

    move-wide/from16 v0, p36

    iput-wide v0, p0, Lcom/google/android/gms/internal/ic;->NX:D

    move-object/from16 v0, p38

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vo:Lcom/google/android/gms/internal/ic;

    move-wide/from16 v0, p39

    iput-wide v0, p0, Lcom/google/android/gms/internal/ic;->NY:D

    move-object/from16 v0, p41

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->mName:Ljava/lang/String;

    move-object/from16 v0, p42

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vp:Lcom/google/android/gms/internal/ic;

    move-object/from16 v0, p43

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vq:Ljava/util/List;

    move-object/from16 v0, p44

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vr:Ljava/lang/String;

    move-object/from16 v0, p45

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vs:Ljava/lang/String;

    move-object/from16 v0, p46

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vt:Ljava/lang/String;

    move-object/from16 v0, p47

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vu:Ljava/lang/String;

    move-object/from16 v0, p48

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vv:Lcom/google/android/gms/internal/ic;

    move-object/from16 v0, p49

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vw:Ljava/lang/String;

    move-object/from16 v0, p50

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vx:Ljava/lang/String;

    move-object/from16 v0, p51

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vy:Ljava/lang/String;

    move-object/from16 v0, p52

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vz:Lcom/google/android/gms/internal/ic;

    move-object/from16 v0, p53

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->VA:Ljava/lang/String;

    move-object/from16 v0, p54

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->VB:Ljava/lang/String;

    move-object/from16 v0, p55

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Rd:Ljava/lang/String;

    move-object/from16 v0, p56

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->ro:Ljava/lang/String;

    move-object/from16 v0, p57

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->VC:Ljava/lang/String;

    move-object/from16 v0, p58

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->VD:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;Lcom/google/android/gms/internal/ic;Ljava/util/List;Lcom/google/android/gms/internal/ic;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;Lcom/google/android/gms/internal/ic;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ic;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ic;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ic;DLcom/google/android/gms/internal/ic;DLjava/lang/String;Lcom/google/android/gms/internal/ic;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ic;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ic;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/google/android/gms/internal/ic;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/internal/ic;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ic;",
            ">;I",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ic;",
            ">;",
            "Lcom/google/android/gms/internal/ic;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ic;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ic;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ic;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ic;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ic;",
            "D",
            "Lcom/google/android/gms/internal/ic;",
            "D",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ic;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ic;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ic;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ic;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ga;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/4 v2, 0x1

    iput v2, p0, Lcom/google/android/gms/internal/ic;->xH:I

    iput-object p2, p0, Lcom/google/android/gms/internal/ic;->UK:Lcom/google/android/gms/internal/ic;

    iput-object p3, p0, Lcom/google/android/gms/internal/ic;->UL:Ljava/util/List;

    iput-object p4, p0, Lcom/google/android/gms/internal/ic;->UM:Lcom/google/android/gms/internal/ic;

    iput-object p5, p0, Lcom/google/android/gms/internal/ic;->UN:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/ic;->UO:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/ic;->UP:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/internal/ic;->UQ:Ljava/util/List;

    iput p9, p0, Lcom/google/android/gms/internal/ic;->UR:I

    iput-object p10, p0, Lcom/google/android/gms/internal/ic;->US:Ljava/util/List;

    iput-object p11, p0, Lcom/google/android/gms/internal/ic;->UT:Lcom/google/android/gms/internal/ic;

    iput-object p12, p0, Lcom/google/android/gms/internal/ic;->UU:Ljava/util/List;

    move-object/from16 v0, p13

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->UV:Ljava/lang/String;

    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->UW:Ljava/lang/String;

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->UX:Lcom/google/android/gms/internal/ic;

    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->UY:Ljava/lang/String;

    move-object/from16 v0, p17

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->UZ:Ljava/lang/String;

    move-object/from16 v0, p18

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->lY:Ljava/lang/String;

    move-object/from16 v0, p19

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Va:Ljava/util/List;

    move-object/from16 v0, p20

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vb:Ljava/lang/String;

    move-object/from16 v0, p21

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vc:Ljava/lang/String;

    move-object/from16 v0, p22

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vd:Ljava/lang/String;

    move-object/from16 v0, p23

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->HD:Ljava/lang/String;

    move-object/from16 v0, p24

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Ve:Ljava/lang/String;

    move-object/from16 v0, p25

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vf:Ljava/lang/String;

    move-object/from16 v0, p26

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vg:Ljava/lang/String;

    move-object/from16 v0, p27

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vh:Ljava/lang/String;

    move-object/from16 v0, p28

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vi:Ljava/lang/String;

    move-object/from16 v0, p29

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vj:Lcom/google/android/gms/internal/ic;

    move-object/from16 v0, p30

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vk:Ljava/lang/String;

    move-object/from16 v0, p31

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vl:Ljava/lang/String;

    move-object/from16 v0, p32

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->wp:Ljava/lang/String;

    move-object/from16 v0, p33

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vm:Ljava/lang/String;

    move-object/from16 v0, p34

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vn:Lcom/google/android/gms/internal/ic;

    move-wide/from16 v0, p35

    iput-wide v0, p0, Lcom/google/android/gms/internal/ic;->NX:D

    move-object/from16 v0, p37

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vo:Lcom/google/android/gms/internal/ic;

    move-wide/from16 v0, p38

    iput-wide v0, p0, Lcom/google/android/gms/internal/ic;->NY:D

    move-object/from16 v0, p40

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->mName:Ljava/lang/String;

    move-object/from16 v0, p41

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vp:Lcom/google/android/gms/internal/ic;

    move-object/from16 v0, p42

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vq:Ljava/util/List;

    move-object/from16 v0, p43

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vr:Ljava/lang/String;

    move-object/from16 v0, p44

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vs:Ljava/lang/String;

    move-object/from16 v0, p45

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vt:Ljava/lang/String;

    move-object/from16 v0, p46

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vu:Ljava/lang/String;

    move-object/from16 v0, p47

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vv:Lcom/google/android/gms/internal/ic;

    move-object/from16 v0, p48

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vw:Ljava/lang/String;

    move-object/from16 v0, p49

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vx:Ljava/lang/String;

    move-object/from16 v0, p50

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vy:Ljava/lang/String;

    move-object/from16 v0, p51

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Vz:Lcom/google/android/gms/internal/ic;

    move-object/from16 v0, p52

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->VA:Ljava/lang/String;

    move-object/from16 v0, p53

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->VB:Ljava/lang/String;

    move-object/from16 v0, p54

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->Rd:Ljava/lang/String;

    move-object/from16 v0, p55

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->ro:Ljava/lang/String;

    move-object/from16 v0, p56

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->VC:Ljava/lang/String;

    move-object/from16 v0, p57

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->VD:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/ga$a;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ga$a;->ff()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method protected aq(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected ar(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected b(Lcom/google/android/gms/internal/ga$a;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ga$a;->ff()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown safe parcelable id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ga$a;->ff()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UK:Lcom/google/android/gms/internal/ic;

    :goto_0
    return-object v0

    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UL:Ljava/util/List;

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UM:Lcom/google/android/gms/internal/ic;

    goto :goto_0

    :pswitch_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UN:Ljava/lang/String;

    goto :goto_0

    :pswitch_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UO:Ljava/lang/String;

    goto :goto_0

    :pswitch_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UP:Ljava/lang/String;

    goto :goto_0

    :pswitch_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UQ:Ljava/util/List;

    goto :goto_0

    :pswitch_8
    iget v0, p0, Lcom/google/android/gms/internal/ic;->UR:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_9
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->US:Ljava/util/List;

    goto :goto_0

    :pswitch_a
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UT:Lcom/google/android/gms/internal/ic;

    goto :goto_0

    :pswitch_b
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UU:Ljava/util/List;

    goto :goto_0

    :pswitch_c
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UV:Ljava/lang/String;

    goto :goto_0

    :pswitch_d
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UW:Ljava/lang/String;

    goto :goto_0

    :pswitch_e
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UX:Lcom/google/android/gms/internal/ic;

    goto :goto_0

    :pswitch_f
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UY:Ljava/lang/String;

    goto :goto_0

    :pswitch_10
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UZ:Ljava/lang/String;

    goto :goto_0

    :pswitch_11
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->lY:Ljava/lang/String;

    goto :goto_0

    :pswitch_12
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Va:Ljava/util/List;

    goto :goto_0

    :pswitch_13
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vb:Ljava/lang/String;

    goto :goto_0

    :pswitch_14
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vc:Ljava/lang/String;

    goto :goto_0

    :pswitch_15
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vd:Ljava/lang/String;

    goto :goto_0

    :pswitch_16
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->HD:Ljava/lang/String;

    goto :goto_0

    :pswitch_17
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Ve:Ljava/lang/String;

    goto :goto_0

    :pswitch_18
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vf:Ljava/lang/String;

    goto :goto_0

    :pswitch_19
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vg:Ljava/lang/String;

    goto :goto_0

    :pswitch_1a
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vh:Ljava/lang/String;

    goto :goto_0

    :pswitch_1b
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vi:Ljava/lang/String;

    goto :goto_0

    :pswitch_1c
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vj:Lcom/google/android/gms/internal/ic;

    goto :goto_0

    :pswitch_1d
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vk:Ljava/lang/String;

    goto :goto_0

    :pswitch_1e
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vl:Ljava/lang/String;

    goto :goto_0

    :pswitch_1f
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->wp:Ljava/lang/String;

    goto :goto_0

    :pswitch_20
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vm:Ljava/lang/String;

    goto :goto_0

    :pswitch_21
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vn:Lcom/google/android/gms/internal/ic;

    goto :goto_0

    :pswitch_22
    iget-wide v0, p0, Lcom/google/android/gms/internal/ic;->NX:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_0

    :pswitch_23
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vo:Lcom/google/android/gms/internal/ic;

    goto :goto_0

    :pswitch_24
    iget-wide v0, p0, Lcom/google/android/gms/internal/ic;->NY:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_0

    :pswitch_25
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->mName:Ljava/lang/String;

    goto :goto_0

    :pswitch_26
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vp:Lcom/google/android/gms/internal/ic;

    goto :goto_0

    :pswitch_27
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vq:Ljava/util/List;

    goto :goto_0

    :pswitch_28
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vr:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_29
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vs:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_2a
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vt:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_2b
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vu:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_2c
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vv:Lcom/google/android/gms/internal/ic;

    goto/16 :goto_0

    :pswitch_2d
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vw:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_2e
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vx:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_2f
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vy:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_30
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vz:Lcom/google/android/gms/internal/ic;

    goto/16 :goto_0

    :pswitch_31
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->VA:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_32
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->VB:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_33
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Rd:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_34
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->ro:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_35
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->VC:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_36
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->VD:Ljava/lang/String;

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
        :pswitch_18
        :pswitch_19
        :pswitch_1a
        :pswitch_1b
        :pswitch_1c
        :pswitch_1d
        :pswitch_1e
        :pswitch_1f
        :pswitch_20
        :pswitch_21
        :pswitch_0
        :pswitch_22
        :pswitch_23
        :pswitch_24
        :pswitch_25
        :pswitch_26
        :pswitch_27
        :pswitch_28
        :pswitch_29
        :pswitch_2a
        :pswitch_2b
        :pswitch_2c
        :pswitch_2d
        :pswitch_2e
        :pswitch_2f
        :pswitch_30
        :pswitch_31
        :pswitch_32
        :pswitch_33
        :pswitch_34
        :pswitch_35
        :pswitch_36
    .end packed-switch
.end method

.method public describeContents()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ic;->CREATOR:Lcom/google/android/gms/internal/id;

    const/4 v0, 0x0

    return v0
.end method

.method public eY()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ga$a",
            "<**>;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    instance-of v0, p1, Lcom/google/android/gms/internal/ic;

    if-nez v0, :cond_0

    move v0, v1

    .end local p1    # "obj":Ljava/lang/Object;
    :goto_0
    return v0

    .restart local p1    # "obj":Ljava/lang/Object;
    :cond_0
    if-ne p0, p1, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/ic;

    .end local p1    # "obj":Ljava/lang/Object;
    sget-object v0, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ga$a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ic;->a(Lcom/google/android/gms/internal/ga$a;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ic;->a(Lcom/google/android/gms/internal/ga$a;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ic;->b(Lcom/google/android/gms/internal/ga$a;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ic;->b(Lcom/google/android/gms/internal/ga$a;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_0

    :cond_4
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ic;->a(Lcom/google/android/gms/internal/ga$a;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    goto :goto_0

    :cond_5
    move v0, v2

    goto :goto_0
.end method

.method public synthetic freeze()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ic;->jq()Lcom/google/android/gms/internal/ic;

    move-result-object v0

    return-object v0
.end method

.method public getAbout()Lcom/google/android/gms/plus/model/moments/ItemScope;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UK:Lcom/google/android/gms/internal/ic;

    return-object v0
.end method

.method public getAdditionalName()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UL:Ljava/util/List;

    return-object v0
.end method

.method public getAddress()Lcom/google/android/gms/plus/model/moments/ItemScope;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UM:Lcom/google/android/gms/internal/ic;

    return-object v0
.end method

.method public getAddressCountry()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UN:Ljava/lang/String;

    return-object v0
.end method

.method public getAddressLocality()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UO:Ljava/lang/String;

    return-object v0
.end method

.method public getAddressRegion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UP:Ljava/lang/String;

    return-object v0
.end method

.method public getAssociated_media()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/plus/model/moments/ItemScope;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UQ:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public getAttendeeCount()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ic;->UR:I

    return v0
.end method

.method public getAttendees()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/plus/model/moments/ItemScope;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->US:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public getAudio()Lcom/google/android/gms/plus/model/moments/ItemScope;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UT:Lcom/google/android/gms/internal/ic;

    return-object v0
.end method

.method public getAuthor()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/plus/model/moments/ItemScope;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UU:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public getBestRating()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UV:Ljava/lang/String;

    return-object v0
.end method

.method public getBirthDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UW:Ljava/lang/String;

    return-object v0
.end method

.method public getByArtist()Lcom/google/android/gms/plus/model/moments/ItemScope;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UX:Lcom/google/android/gms/internal/ic;

    return-object v0
.end method

.method public getCaption()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UY:Ljava/lang/String;

    return-object v0
.end method

.method public getContentSize()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UZ:Ljava/lang/String;

    return-object v0
.end method

.method public getContentUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->lY:Ljava/lang/String;

    return-object v0
.end method

.method public getContributor()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/plus/model/moments/ItemScope;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Va:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public getDateCreated()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vb:Ljava/lang/String;

    return-object v0
.end method

.method public getDateModified()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vc:Ljava/lang/String;

    return-object v0
.end method

.method public getDatePublished()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vd:Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->HD:Ljava/lang/String;

    return-object v0
.end method

.method public getDuration()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Ve:Ljava/lang/String;

    return-object v0
.end method

.method public getEmbedUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vf:Ljava/lang/String;

    return-object v0
.end method

.method public getEndDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vg:Ljava/lang/String;

    return-object v0
.end method

.method public getFamilyName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vh:Ljava/lang/String;

    return-object v0
.end method

.method public getGender()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vi:Ljava/lang/String;

    return-object v0
.end method

.method public getGeo()Lcom/google/android/gms/plus/model/moments/ItemScope;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vj:Lcom/google/android/gms/internal/ic;

    return-object v0
.end method

.method public getGivenName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vk:Ljava/lang/String;

    return-object v0
.end method

.method public getHeight()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vl:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->wp:Ljava/lang/String;

    return-object v0
.end method

.method public getImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vm:Ljava/lang/String;

    return-object v0
.end method

.method public getInAlbum()Lcom/google/android/gms/plus/model/moments/ItemScope;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vn:Lcom/google/android/gms/internal/ic;

    return-object v0
.end method

.method public getLatitude()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ic;->NX:D

    return-wide v0
.end method

.method public getLocation()Lcom/google/android/gms/plus/model/moments/ItemScope;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vo:Lcom/google/android/gms/internal/ic;

    return-object v0
.end method

.method public getLongitude()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ic;->NY:D

    return-wide v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public getPartOfTVSeries()Lcom/google/android/gms/plus/model/moments/ItemScope;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vp:Lcom/google/android/gms/internal/ic;

    return-object v0
.end method

.method public getPerformers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/plus/model/moments/ItemScope;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vq:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public getPlayerType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vr:Ljava/lang/String;

    return-object v0
.end method

.method public getPostOfficeBoxNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vs:Ljava/lang/String;

    return-object v0
.end method

.method public getPostalCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vt:Ljava/lang/String;

    return-object v0
.end method

.method public getRatingValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vu:Ljava/lang/String;

    return-object v0
.end method

.method public getReviewRating()Lcom/google/android/gms/plus/model/moments/ItemScope;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vv:Lcom/google/android/gms/internal/ic;

    return-object v0
.end method

.method public getStartDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vw:Ljava/lang/String;

    return-object v0
.end method

.method public getStreetAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vx:Ljava/lang/String;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vy:Ljava/lang/String;

    return-object v0
.end method

.method public getThumbnail()Lcom/google/android/gms/plus/model/moments/ItemScope;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vz:Lcom/google/android/gms/internal/ic;

    return-object v0
.end method

.method public getThumbnailUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->VA:Ljava/lang/String;

    return-object v0
.end method

.method public getTickerSymbol()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->VB:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Rd:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->ro:Ljava/lang/String;

    return-object v0
.end method

.method getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ic;->xH:I

    return v0
.end method

.method public getWidth()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->VC:Ljava/lang/String;

    return-object v0
.end method

.method public getWorstRating()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->VD:Ljava/lang/String;

    return-object v0
.end method

.method public hasAbout()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasAdditionalName()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasAddress()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasAddressCountry()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasAddressLocality()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasAddressRegion()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasAssociated_media()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasAttendeeCount()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasAttendees()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasAudio()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0xb

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasAuthor()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0xc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasBestRating()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0xd

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasBirthDate()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasByArtist()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0xf

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasCaption()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x10

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasContentSize()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasContentUrl()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x12

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasContributor()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x13

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasDateCreated()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x14

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasDateModified()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x15

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasDatePublished()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x16

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasDescription()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x17

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasDuration()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x18

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasEmbedUrl()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasEndDate()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x1a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasFamilyName()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x1b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasGender()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x1c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasGeo()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x1d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasGivenName()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x1e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasHeight()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x1f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasId()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x20

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasImage()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x21

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasInAlbum()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x22

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasLatitude()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x24

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasLocation()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x25

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasLongitude()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x26

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasName()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x27

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasPartOfTVSeries()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x28

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasPerformers()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x29

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasPlayerType()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x2a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasPostOfficeBoxNumber()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x2b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasPostalCode()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x2c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasRatingValue()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x2d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasReviewRating()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x2e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasStartDate()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x2f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasStreetAddress()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x30

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasText()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x31

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasThumbnail()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x32

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasThumbnailUrl()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x33

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasTickerSymbol()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x34

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasType()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x35

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasUrl()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x36

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasWidth()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x37

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hasWorstRating()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    const/16 v1, 0x38

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x0

    sget-object v1, Lcom/google/android/gms/internal/ic;->UI:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ga$a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ic;->a(Lcom/google/android/gms/internal/ga$a;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ga$a;->ff()I

    move-result v3

    add-int/2addr v1, v3

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ic;->b(Lcom/google/android/gms/internal/ga$a;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method public isDataValid()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method ja()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UJ:Ljava/util/Set;

    return-object v0
.end method

.method jb()Lcom/google/android/gms/internal/ic;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UK:Lcom/google/android/gms/internal/ic;

    return-object v0
.end method

.method jc()Lcom/google/android/gms/internal/ic;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UM:Lcom/google/android/gms/internal/ic;

    return-object v0
.end method

.method jd()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ic;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UQ:Ljava/util/List;

    return-object v0
.end method

.method je()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ic;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->US:Ljava/util/List;

    return-object v0
.end method

.method jf()Lcom/google/android/gms/internal/ic;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UT:Lcom/google/android/gms/internal/ic;

    return-object v0
.end method

.method jg()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ic;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UU:Ljava/util/List;

    return-object v0
.end method

.method jh()Lcom/google/android/gms/internal/ic;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->UX:Lcom/google/android/gms/internal/ic;

    return-object v0
.end method

.method ji()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ic;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Va:Ljava/util/List;

    return-object v0
.end method

.method jj()Lcom/google/android/gms/internal/ic;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vj:Lcom/google/android/gms/internal/ic;

    return-object v0
.end method

.method jk()Lcom/google/android/gms/internal/ic;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vn:Lcom/google/android/gms/internal/ic;

    return-object v0
.end method

.method jl()Lcom/google/android/gms/internal/ic;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vo:Lcom/google/android/gms/internal/ic;

    return-object v0
.end method

.method jm()Lcom/google/android/gms/internal/ic;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vp:Lcom/google/android/gms/internal/ic;

    return-object v0
.end method

.method jn()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ic;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vq:Ljava/util/List;

    return-object v0
.end method

.method jo()Lcom/google/android/gms/internal/ic;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vv:Lcom/google/android/gms/internal/ic;

    return-object v0
.end method

.method jp()Lcom/google/android/gms/internal/ic;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->Vz:Lcom/google/android/gms/internal/ic;

    return-object v0
.end method

.method public jq()Lcom/google/android/gms/internal/ic;
    .locals 0

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ic;->CREATOR:Lcom/google/android/gms/internal/id;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/id;->a(Lcom/google/android/gms/internal/ic;Landroid/os/Parcel;I)V

    return-void
.end method
