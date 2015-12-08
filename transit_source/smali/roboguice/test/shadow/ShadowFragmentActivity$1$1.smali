.class Lroboguice/test/shadow/ShadowFragmentActivity$1$1;
.super Landroid/support/v4/app/FragmentTransaction;
.source "ShadowFragmentActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lroboguice/test/shadow/ShadowFragmentActivity$1;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lroboguice/test/shadow/ShadowFragmentActivity$1;


# direct methods
.method constructor <init>(Lroboguice/test/shadow/ShadowFragmentActivity$1;)V
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lroboguice/test/shadow/ShadowFragmentActivity$1$1;->this$1:Lroboguice/test/shadow/ShadowFragmentActivity$1;

    invoke-direct {p0}, Landroid/support/v4/app/FragmentTransaction;-><init>()V

    return-void
.end method


# virtual methods
.method public add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .param p1, "i"    # I
    .param p2, "fragment"    # Landroid/support/v4/app/Fragment;

    .prologue
    .line 37
    const/4 v0, 0x0

    return-object v0
.end method

.method public add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .param p1, "i"    # I
    .param p2, "fragment"    # Landroid/support/v4/app/Fragment;
    .param p3, "s"    # Ljava/lang/String;

    .prologue
    .line 42
    const/4 v0, 0x0

    return-object v0
.end method

.method public add(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .param p1, "fragment"    # Landroid/support/v4/app/Fragment;
    .param p2, "s"    # Ljava/lang/String;

    .prologue
    .line 32
    const/4 v0, 0x0

    return-object v0
.end method

.method public addToBackStack(Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .param p1, "s"    # Ljava/lang/String;

    .prologue
    .line 102
    const/4 v0, 0x0

    return-object v0
.end method

.method public attach(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .param p1, "fragment"    # Landroid/support/v4/app/Fragment;

    .prologue
    .line 77
    const/4 v0, 0x0

    return-object v0
.end method

.method public commit()I
    .locals 1

    .prologue
    .line 137
    const/4 v0, 0x0

    return v0
.end method

.method public commitAllowingStateLoss()I
    .locals 1

    .prologue
    .line 142
    const/4 v0, 0x0

    return v0
.end method

.method public detach(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .param p1, "fragment"    # Landroid/support/v4/app/Fragment;

    .prologue
    .line 72
    const/4 v0, 0x0

    return-object v0
.end method

.method public disallowAddToBackStack()Landroid/support/v4/app/FragmentTransaction;
    .locals 1

    .prologue
    .line 112
    const/4 v0, 0x0

    return-object v0
.end method

.method public hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .param p1, "fragment"    # Landroid/support/v4/app/Fragment;

    .prologue
    .line 62
    const/4 v0, 0x0

    return-object v0
.end method

.method public isAddToBackStackAllowed()Z
    .locals 1

    .prologue
    .line 107
    const/4 v0, 0x0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 82
    const/4 v0, 0x0

    return v0
.end method

.method public remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .param p1, "fragment"    # Landroid/support/v4/app/Fragment;

    .prologue
    .line 57
    const/4 v0, 0x0

    return-object v0
.end method

.method public replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .param p1, "i"    # I
    .param p2, "fragment"    # Landroid/support/v4/app/Fragment;

    .prologue
    .line 47
    const/4 v0, 0x0

    return-object v0
.end method

.method public replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .param p1, "i"    # I
    .param p2, "fragment"    # Landroid/support/v4/app/Fragment;
    .param p3, "s"    # Ljava/lang/String;

    .prologue
    .line 52
    const/4 v0, 0x0

    return-object v0
.end method

.method public setBreadCrumbShortTitle(I)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .param p1, "i"    # I

    .prologue
    .line 127
    const/4 v0, 0x0

    return-object v0
.end method

.method public setBreadCrumbShortTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .param p1, "charSequence"    # Ljava/lang/CharSequence;

    .prologue
    .line 132
    const/4 v0, 0x0

    return-object v0
.end method

.method public setBreadCrumbTitle(I)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .param p1, "i"    # I

    .prologue
    .line 117
    const/4 v0, 0x0

    return-object v0
.end method

.method public setBreadCrumbTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .param p1, "charSequence"    # Ljava/lang/CharSequence;

    .prologue
    .line 122
    const/4 v0, 0x0

    return-object v0
.end method

.method public setCustomAnimations(II)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .param p1, "i"    # I
    .param p2, "i1"    # I

    .prologue
    .line 87
    const/4 v0, 0x0

    return-object v0
.end method

.method public setCustomAnimations(IIII)Landroid/support/v4/app/FragmentTransaction;
    .locals 0
    .param p1, "i"    # I
    .param p2, "i1"    # I
    .param p3, "i2"    # I
    .param p4, "i3"    # I

    .prologue
    .line 147
    return-object p0
.end method

.method public setTransition(I)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .param p1, "i"    # I

    .prologue
    .line 92
    const/4 v0, 0x0

    return-object v0
.end method

.method public setTransitionStyle(I)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .param p1, "i"    # I

    .prologue
    .line 97
    const/4 v0, 0x0

    return-object v0
.end method

.method public show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    .locals 1
    .param p1, "fragment"    # Landroid/support/v4/app/Fragment;

    .prologue
    .line 67
    const/4 v0, 0x0

    return-object v0
.end method
