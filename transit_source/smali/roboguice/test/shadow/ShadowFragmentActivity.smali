.class public Lroboguice/test/shadow/ShadowFragmentActivity;
.super Lcom/xtremelabs/robolectric/shadows/ShadowActivity;
.source "ShadowFragmentActivity.java"


# annotations
.annotation runtime Lcom/xtremelabs/robolectric/internal/Implements;
    value = Landroid/support/v4/app/FragmentActivity;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/xtremelabs/robolectric/shadows/ShadowActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;
    .locals 1
    .annotation runtime Lcom/xtremelabs/robolectric/internal/Implementation;
    .end annotation

    .prologue
    .line 22
    new-instance v0, Lroboguice/test/shadow/ShadowFragmentActivity$1;

    invoke-direct {v0, p0}, Lroboguice/test/shadow/ShadowFragmentActivity$1;-><init>(Lroboguice/test/shadow/ShadowFragmentActivity;)V

    return-object v0
.end method
