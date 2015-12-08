.class public Lcom/flurry/sdk/jr;
.super Lcom/flurry/sdk/jw;
.source "SourceFile"


# instance fields
.field public a:Landroid/app/Activity;

.field public b:Lcom/flurry/sdk/jr$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 16
    const-string v0, "com.flurry.android.sdk.ActivityLifecycleEvent"

    invoke-direct {p0, v0}, Lcom/flurry/sdk/jw;-><init>(Ljava/lang/String;)V

    .line 17
    return-void
.end method
