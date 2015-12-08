.class final Lkik/android/chat/fragment/ng;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/a/d/aa;

.field final synthetic b:Lkik/android/chat/fragment/KikPermissionsFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikPermissionsFragment;Lkik/a/d/aa;)V
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lkik/android/chat/fragment/ng;->b:Lkik/android/chat/fragment/KikPermissionsFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/ng;->a:Lkik/a/d/aa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 110
    new-instance v0, Lcom/kik/cards/util/UserDataParcelable;

    iget-object v1, p0, Lkik/android/chat/fragment/ng;->a:Lkik/a/d/aa;

    iget-object v1, v1, Lkik/a/d/aa;->c:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lkik/android/chat/fragment/ng;->a:Lkik/a/d/aa;

    iget-object v3, v3, Lkik/a/d/aa;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/ng;->a:Lkik/a/d/aa;

    iget-object v3, v3, Lkik/a/d/aa;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/ng;->a:Lkik/a/d/aa;

    iget-object v3, v3, Lkik/a/d/aa;->f:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Lcom/kik/cards/util/UserDataParcelable;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 112
    const-string v2, "kik.permissionFragment.extra.returned.userdata"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 113
    iget-object v0, p0, Lkik/android/chat/fragment/ng;->b:Lkik/android/chat/fragment/KikPermissionsFragment;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikPermissionsFragment;->a(Landroid/os/Bundle;)V

    .line 114
    iget-object v0, p0, Lkik/android/chat/fragment/ng;->b:Lkik/android/chat/fragment/KikPermissionsFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikPermissionsFragment;->J()V

    .line 115
    return-void
.end method
