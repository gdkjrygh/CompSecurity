.class public Lcom/facebook/f/n;
.super Ljava/lang/Object;
.source "GkPrefKeys.java"


# static fields
.field public static final a:Lcom/facebook/prefs/shared/ae;

.field public static final b:Lcom/facebook/prefs/shared/ae;

.field public static final c:Lcom/facebook/prefs/shared/ae;

.field public static final d:Lcom/facebook/prefs/shared/ae;

.field public static final e:Lcom/facebook/prefs/shared/ae;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 13
    sget-object v0, Lcom/facebook/prefs/shared/aj;->c:Lcom/facebook/prefs/shared/ae;

    const-string v1, "gk/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/f/n;->a:Lcom/facebook/prefs/shared/ae;

    .line 14
    sget-object v0, Lcom/facebook/f/n;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "version"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/f/n;->b:Lcom/facebook/prefs/shared/ae;

    .line 15
    sget-object v0, Lcom/facebook/f/n;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "values/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/f/n;->c:Lcom/facebook/prefs/shared/ae;

    .line 16
    sget-object v0, Lcom/facebook/f/n;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "last_fetch_time_ms"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/f/n;->d:Lcom/facebook/prefs/shared/ae;

    .line 18
    sget-object v0, Lcom/facebook/f/n;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "sessionless_gatekeeper_last_fetch_time_ms"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/f/n;->e:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;
    .locals 2

    .prologue
    .line 22
    sget-object v0, Lcom/facebook/f/n;->c:Lcom/facebook/prefs/shared/ae;

    invoke-static {p0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    return-object v0
.end method
