.class Lroboguice/test/shadow/ShadowFragmentActivity$1;
.super Landroid/support/v4/app/FragmentManager;
.source "ShadowFragmentActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lroboguice/test/shadow/ShadowFragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lroboguice/test/shadow/ShadowFragmentActivity;


# direct methods
.method constructor <init>(Lroboguice/test/shadow/ShadowFragmentActivity;)V
    .locals 0

    .prologue
    .line 22
    iput-object p1, p0, Lroboguice/test/shadow/ShadowFragmentActivity$1;->this$0:Lroboguice/test/shadow/ShadowFragmentActivity;

    invoke-direct {p0}, Landroid/support/v4/app/FragmentManager;-><init>()V

    return-void
.end method


# virtual methods
.method public addOnBackStackChangedListener(Landroid/support/v4/app/FragmentManager$OnBackStackChangedListener;)V
    .locals 0
    .param p1, "onBackStackChangedListener"    # Landroid/support/v4/app/FragmentManager$OnBackStackChangedListener;

    .prologue
    .line 25
    return-void
.end method

.method public beginTransaction()Landroid/support/v4/app/FragmentTransaction;
    .locals 1

    .prologue
    .line 29
    new-instance v0, Lroboguice/test/shadow/ShadowFragmentActivity$1$1;

    invoke-direct {v0, p0}, Lroboguice/test/shadow/ShadowFragmentActivity$1$1;-><init>(Lroboguice/test/shadow/ShadowFragmentActivity$1;)V

    return-object v0
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 0
    .param p1, "s"    # Ljava/lang/String;
    .param p2, "fileDescriptor"    # Ljava/io/FileDescriptor;
    .param p3, "printWriter"    # Ljava/io/PrintWriter;
    .param p4, "strings"    # [Ljava/lang/String;

    .prologue
    .line 224
    return-void
.end method

.method public executePendingTransactions()Z
    .locals 1

    .prologue
    .line 154
    const/4 v0, 0x0

    return v0
.end method

.method public findFragmentById(I)Landroid/support/v4/app/Fragment;
    .locals 1
    .param p1, "i"    # I

    .prologue
    .line 159
    const/4 v0, 0x0

    return-object v0
.end method

.method public findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
    .locals 1
    .param p1, "s"    # Ljava/lang/String;

    .prologue
    .line 164
    const/4 v0, 0x0

    return-object v0
.end method

.method public getBackStackEntryAt(I)Landroid/support/v4/app/FragmentManager$BackStackEntry;
    .locals 1
    .param p1, "i"    # I

    .prologue
    .line 201
    const/4 v0, 0x0

    return-object v0
.end method

.method public getBackStackEntryCount()I
    .locals 1

    .prologue
    .line 196
    const/4 v0, 0x0

    return v0
.end method

.method public getFragment(Landroid/os/Bundle;Ljava/lang/String;)Landroid/support/v4/app/Fragment;
    .locals 1
    .param p1, "bundle"    # Landroid/os/Bundle;
    .param p2, "s"    # Ljava/lang/String;

    .prologue
    .line 214
    const/4 v0, 0x0

    return-object v0
.end method

.method public popBackStack()V
    .locals 0

    .prologue
    .line 169
    return-void
.end method

.method public popBackStack(II)V
    .locals 0
    .param p1, "i"    # I
    .param p2, "i1"    # I

    .prologue
    .line 187
    return-void
.end method

.method public popBackStack(Ljava/lang/String;I)V
    .locals 0
    .param p1, "s"    # Ljava/lang/String;
    .param p2, "i"    # I

    .prologue
    .line 178
    return-void
.end method

.method public popBackStackImmediate()Z
    .locals 1

    .prologue
    .line 173
    const/4 v0, 0x0

    return v0
.end method

.method public popBackStackImmediate(II)Z
    .locals 1
    .param p1, "i"    # I
    .param p2, "i1"    # I

    .prologue
    .line 191
    const/4 v0, 0x0

    return v0
.end method

.method public popBackStackImmediate(Ljava/lang/String;I)Z
    .locals 1
    .param p1, "s"    # Ljava/lang/String;
    .param p2, "i"    # I

    .prologue
    .line 182
    const/4 v0, 0x0

    return v0
.end method

.method public putFragment(Landroid/os/Bundle;Ljava/lang/String;Landroid/support/v4/app/Fragment;)V
    .locals 0
    .param p1, "bundle"    # Landroid/os/Bundle;
    .param p2, "s"    # Ljava/lang/String;
    .param p3, "fragment"    # Landroid/support/v4/app/Fragment;

    .prologue
    .line 210
    return-void
.end method

.method public removeOnBackStackChangedListener(Landroid/support/v4/app/FragmentManager$OnBackStackChangedListener;)V
    .locals 0
    .param p1, "onBackStackChangedListener"    # Landroid/support/v4/app/FragmentManager$OnBackStackChangedListener;

    .prologue
    .line 206
    return-void
.end method

.method public saveFragmentInstanceState(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/Fragment$SavedState;
    .locals 1
    .param p1, "fragment"    # Landroid/support/v4/app/Fragment;

    .prologue
    .line 219
    const/4 v0, 0x0

    return-object v0
.end method
