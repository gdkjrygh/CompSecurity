.class final Lkik/android/chat/fragment/nj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkik/android/chat/fragment/KikPickContactFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikPickContactFragment;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lkik/android/chat/fragment/nj;->b:Lkik/android/chat/fragment/KikPickContactFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/nj;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 107
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 108
    const-string v1, "kikpickcontactfrag.groupExtraJidReturn"

    iget-object v2, p0, Lkik/android/chat/fragment/nj;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    iget-object v1, p0, Lkik/android/chat/fragment/nj;->b:Lkik/android/chat/fragment/KikPickContactFragment;

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikPickContactFragment;->a(Landroid/os/Bundle;)V

    .line 110
    iget-object v0, p0, Lkik/android/chat/fragment/nj;->b:Lkik/android/chat/fragment/KikPickContactFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikPickContactFragment;->J()V

    .line 111
    return-void
.end method
