.class public Lcom/facebook/zero/a/c;
.super Ljava/lang/Object;
.source "ZeroPrefKeys.java"


# static fields
.field public static final a:Lcom/facebook/prefs/shared/ae;

.field public static final b:Lcom/facebook/prefs/shared/ae;

.field public static final c:Lcom/facebook/prefs/shared/ae;

.field public static final d:Lcom/facebook/prefs/shared/ae;

.field public static final e:Lcom/facebook/prefs/shared/ae;

.field public static final f:Lcom/facebook/prefs/shared/ae;

.field public static final g:Lcom/facebook/prefs/shared/ae;

.field public static final h:Lcom/facebook/prefs/shared/ae;

.field public static final i:Lcom/facebook/prefs/shared/ae;

.field public static final j:Lcom/facebook/prefs/shared/ae;

.field public static final k:Lcom/facebook/prefs/shared/ae;

.field public static final l:Lcom/facebook/prefs/shared/ae;

.field public static final m:Lcom/facebook/prefs/shared/ae;

.field private static final n:Lcom/facebook/prefs/shared/ae;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 14
    sget-object v0, Lcom/facebook/prefs/shared/aj;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "zero_rating2/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/zero/a/c;->a:Lcom/facebook/prefs/shared/ae;

    .line 16
    sget-object v0, Lcom/facebook/zero/a/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "code_pairs"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/zero/a/c;->b:Lcom/facebook/prefs/shared/ae;

    .line 21
    sget-object v0, Lcom/facebook/zero/a/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "network_type"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/zero/a/c;->c:Lcom/facebook/prefs/shared/ae;

    .line 23
    sget-object v0, Lcom/facebook/zero/a/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "last_time_checked"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/zero/a/c;->d:Lcom/facebook/prefs/shared/ae;

    .line 25
    sget-object v0, Lcom/facebook/zero/a/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "current_zero_rating_status"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/zero/a/c;->e:Lcom/facebook/prefs/shared/ae;

    .line 27
    sget-object v0, Lcom/facebook/zero/a/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "token"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/zero/a/c;->f:Lcom/facebook/prefs/shared/ae;

    .line 32
    sget-object v0, Lcom/facebook/zero/a/c;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "dialogs/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/zero/a/c;->n:Lcom/facebook/prefs/shared/ae;

    .line 33
    sget-object v0, Lcom/facebook/zero/a/c;->n:Lcom/facebook/prefs/shared/ae;

    const-string v1, "view_timeline"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/zero/a/c;->g:Lcom/facebook/prefs/shared/ae;

    .line 34
    sget-object v0, Lcom/facebook/zero/a/c;->n:Lcom/facebook/prefs/shared/ae;

    const-string v1, "view_contact_card_map"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/zero/a/c;->h:Lcom/facebook/prefs/shared/ae;

    .line 36
    sget-object v0, Lcom/facebook/zero/a/c;->n:Lcom/facebook/prefs/shared/ae;

    const-string v1, "view_message_map"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/zero/a/c;->i:Lcom/facebook/prefs/shared/ae;

    .line 37
    sget-object v0, Lcom/facebook/zero/a/c;->n:Lcom/facebook/prefs/shared/ae;

    const-string v1, "image_search"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/zero/a/c;->j:Lcom/facebook/prefs/shared/ae;

    .line 38
    sget-object v0, Lcom/facebook/zero/a/c;->n:Lcom/facebook/prefs/shared/ae;

    const-string v1, "goto_external_url"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/zero/a/c;->k:Lcom/facebook/prefs/shared/ae;

    .line 39
    sget-object v0, Lcom/facebook/zero/a/c;->n:Lcom/facebook/prefs/shared/ae;

    const-string v1, "voip_call_user"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/zero/a/c;->l:Lcom/facebook/prefs/shared/ae;

    .line 40
    sget-object v0, Lcom/facebook/zero/a/c;->n:Lcom/facebook/prefs/shared/ae;

    const-string v1, "carrier_bottom_banner"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/zero/a/c;->m:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/facebook/prefs/shared/ae;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 43
    sget-object v0, Lcom/facebook/zero/a/c;->n:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p0, v0}, Lcom/facebook/prefs/shared/ae;->b(Lcom/facebook/common/s/a;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
