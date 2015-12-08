.class public Lkik/android/HeadphoneUnpluggedReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field private static b:Lkik/android/HeadphoneUnpluggedReceiver;


# instance fields
.field private a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    new-instance v0, Lkik/android/HeadphoneUnpluggedReceiver;

    invoke-direct {v0}, Lkik/android/HeadphoneUnpluggedReceiver;-><init>()V

    sput-object v0, Lkik/android/HeadphoneUnpluggedReceiver;->b:Lkik/android/HeadphoneUnpluggedReceiver;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/HeadphoneUnpluggedReceiver;->a:Ljava/util/List;

    return-void
.end method

.method public static a()Lkik/android/HeadphoneUnpluggedReceiver;
    .locals 1

    .prologue
    .line 25
    sget-object v0, Lkik/android/HeadphoneUnpluggedReceiver;->b:Lkik/android/HeadphoneUnpluggedReceiver;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 30
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 31
    const-string v1, "android.media.AUDIO_BECOMING_NOISY"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 32
    sget-object v1, Lkik/android/HeadphoneUnpluggedReceiver;->b:Lkik/android/HeadphoneUnpluggedReceiver;

    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 33
    return-void
.end method


# virtual methods
.method public final a(Lkik/android/sdkutils/a;)V
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lkik/android/HeadphoneUnpluggedReceiver;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    return-void
.end method

.method public final b(Lkik/android/sdkutils/a;)V
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lkik/android/HeadphoneUnpluggedReceiver;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 43
    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 48
    iget-object v0, p0, Lkik/android/HeadphoneUnpluggedReceiver;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/sdkutils/a;

    invoke-interface {v0}, Lkik/android/sdkutils/a;->e()V

    goto :goto_0

    .line 49
    :cond_0
    return-void
.end method
