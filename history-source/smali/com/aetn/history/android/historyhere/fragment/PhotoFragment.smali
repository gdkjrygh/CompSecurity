.class public Lcom/aetn/history/android/historyhere/fragment/PhotoFragment;
.super Landroid/app/Fragment;
.source "PhotoFragment.java"


# instance fields
.field private final TAG:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 15
    const-string v0, "PhotoFragment"

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/PhotoFragment;->TAG:Ljava/lang/String;

    .line 20
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 24
    invoke-super {p0, p1}, Landroid/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 26
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "container"    # Landroid/view/ViewGroup;
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 31
    const v1, 0x7f03002d

    const/4 v2, 0x0

    invoke-virtual {p1, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 32
    .local v0, "v":Landroid/view/View;
    return-object v0
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 37
    const-string v0, "PhotoFragment"

    const-string v1, "onResume()"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    .line 39
    return-void
.end method

.method public setData(Lcom/aetn/history/android/historyhere/model/PhotoData;)V
    .locals 0
    .param p1, "data"    # Lcom/aetn/history/android/historyhere/model/PhotoData;

    .prologue
    .line 44
    return-void
.end method
