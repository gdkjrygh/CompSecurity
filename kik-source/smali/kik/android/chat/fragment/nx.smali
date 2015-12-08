.class final Lkik/android/chat/fragment/nx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final synthetic a:Lkik/android/util/p$a;

.field final synthetic b:Lkik/android/chat/fragment/KikPreferenceLaunchpad;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikPreferenceLaunchpad;Lkik/android/util/p$a;)V
    .locals 0

    .prologue
    .line 286
    iput-object p1, p0, Lkik/android/chat/fragment/nx;->b:Lkik/android/chat/fragment/KikPreferenceLaunchpad;

    iput-object p2, p0, Lkik/android/chat/fragment/nx;->a:Lkik/android/util/p$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 290
    iget-object v0, p0, Lkik/android/chat/fragment/nx;->a:Lkik/android/util/p$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/util/p$a;->cancel(Z)Z

    .line 291
    return-void
.end method
