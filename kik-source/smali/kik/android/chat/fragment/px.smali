.class final Lkik/android/chat/fragment/px;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikStartGroupFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikStartGroupFragment;)V
    .locals 0

    .prologue
    .line 594
    iput-object p1, p0, Lkik/android/chat/fragment/px;->a:Lkik/android/chat/fragment/KikStartGroupFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 598
    iget-object v0, p0, Lkik/android/chat/fragment/px;->a:Lkik/android/chat/fragment/KikStartGroupFragment;

    const v1, 0x7f090337

    invoke-static {v1}, Lkik/android/chat/fragment/KikStartGroupFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f09001f

    invoke-static {v2}, Lkik/android/chat/fragment/KikStartGroupFragment;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikStartGroupFragment;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 599
    iget-object v0, p0, Lkik/android/chat/fragment/px;->a:Lkik/android/chat/fragment/KikStartGroupFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/px;->a:Lkik/android/chat/fragment/KikStartGroupFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikStartGroupFragment;->c(Lkik/android/chat/fragment/KikStartGroupFragment;)Lkik/a/d/n;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikStartGroupFragment;->b(Lkik/android/chat/fragment/KikStartGroupFragment;Lkik/a/d/n;)V

    .line 600
    return-void
.end method
