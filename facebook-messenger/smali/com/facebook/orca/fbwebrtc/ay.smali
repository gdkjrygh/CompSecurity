.class public Lcom/facebook/orca/fbwebrtc/ay;
.super Ljava/lang/Object;
.source "WebrtcPrefKeys.java"


# static fields
.field public static final a:Lcom/facebook/prefs/shared/ae;

.field public static final b:Lcom/facebook/prefs/shared/ae;

.field public static final c:Lcom/facebook/prefs/shared/ae;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 13
    sget-object v0, Lcom/facebook/prefs/shared/aj;->c:Lcom/facebook/prefs/shared/ae;

    const-string v1, "webrtc/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/fbwebrtc/ay;->a:Lcom/facebook/prefs/shared/ae;

    .line 15
    sget-object v0, Lcom/facebook/orca/fbwebrtc/ay;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "last_call_volume"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/fbwebrtc/ay;->b:Lcom/facebook/prefs/shared/ae;

    .line 17
    sget-object v0, Lcom/facebook/orca/fbwebrtc/ay;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "free_call_acceptance"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/fbwebrtc/ay;->c:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
