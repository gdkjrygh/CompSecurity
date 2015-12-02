.class public Lcom/facebook/orca/prefs/f;
.super Ljava/lang/Object;
.source "InternalPrefKeys.java"


# static fields
.field public static final a:Lcom/facebook/prefs/shared/ae;

.field public static final b:Lcom/facebook/prefs/shared/ae;

.field public static final c:Lcom/facebook/prefs/shared/ae;

.field public static final d:Lcom/facebook/prefs/shared/ae;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 16
    sget-object v0, Lcom/facebook/prefs/shared/aj;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "voip/"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/f;->a:Lcom/facebook/prefs/shared/ae;

    .line 18
    sget-object v0, Lcom/facebook/orca/prefs/f;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "audio_mode"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/f;->b:Lcom/facebook/prefs/shared/ae;

    .line 20
    sget-object v0, Lcom/facebook/orca/prefs/f;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "speaker_audio_mode"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/f;->c:Lcom/facebook/prefs/shared/ae;

    .line 22
    sget-object v0, Lcom/facebook/orca/prefs/f;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "volume_stream_type"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/f;->d:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
