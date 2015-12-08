.class public Lroboguice/test/shadow/ShadowFragment;
.super Ljava/lang/Object;
.source "ShadowFragment.java"


# annotations
.annotation runtime Lcom/xtremelabs/robolectric/internal/Implements;
    value = Landroid/support/v4/app/Fragment;
.end annotation


# instance fields
.field protected activity:Landroid/support/v4/app/FragmentActivity;

.field protected view:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getActivity()Landroid/support/v4/app/FragmentActivity;
    .locals 1
    .annotation runtime Lcom/xtremelabs/robolectric/internal/Implementation;
    .end annotation

    .prologue
    .line 19
    iget-object v0, p0, Lroboguice/test/shadow/ShadowFragment;->activity:Landroid/support/v4/app/FragmentActivity;

    return-object v0
.end method

.method public getView()Landroid/view/View;
    .locals 1
    .annotation runtime Lcom/xtremelabs/robolectric/internal/Implementation;
    .end annotation

    .prologue
    .line 24
    iget-object v0, p0, Lroboguice/test/shadow/ShadowFragment;->view:Landroid/view/View;

    return-object v0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0
    .param p1, "a"    # Landroid/app/Activity;
    .annotation runtime Lcom/xtremelabs/robolectric/internal/Implementation;
    .end annotation

    .prologue
    .line 34
    check-cast p1, Landroid/support/v4/app/FragmentActivity;

    .end local p1    # "a":Landroid/app/Activity;
    iput-object p1, p0, Lroboguice/test/shadow/ShadowFragment;->activity:Landroid/support/v4/app/FragmentActivity;

    .line 35
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0
    .param p1, "v"    # Landroid/view/View;
    .param p2, "savedInstanceState"    # Landroid/os/Bundle;
    .annotation runtime Lcom/xtremelabs/robolectric/internal/Implementation;
    .end annotation

    .prologue
    .line 29
    iput-object p1, p0, Lroboguice/test/shadow/ShadowFragment;->view:Landroid/view/View;

    .line 30
    return-void
.end method
