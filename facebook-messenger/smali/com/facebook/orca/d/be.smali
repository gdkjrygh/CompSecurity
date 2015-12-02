.class public Lcom/facebook/orca/d/be;
.super Ljava/lang/Object;
.source "IsAudioRecorderEnabledProvider.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/facebook/prefs/shared/ae;


# instance fields
.field private final b:Lcom/facebook/prefs/shared/d;

.field private final c:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-string v0, "messenger_audio_recorder_android"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/d/be;->a:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/prefs/shared/d;Landroid/content/Context;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/facebook/orca/d/be;->b:Lcom/facebook/prefs/shared/d;

    .line 31
    iput-object p2, p0, Lcom/facebook/orca/d/be;->c:Landroid/content/Context;

    .line 32
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 36
    iget-object v1, p0, Lcom/facebook/orca/d/be;->b:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/d/be;->a:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/d/be;->c:Landroid/content/Context;

    const-string v2, "android.permission.RECORD_AUDIO"

    invoke-virtual {v1, v2}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/d/be;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "android.hardware.microphone"

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 18
    invoke-virtual {p0}, Lcom/facebook/orca/d/be;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
