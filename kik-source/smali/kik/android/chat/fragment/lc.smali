.class final Lkik/android/chat/fragment/lc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;)V
    .locals 0

    .prologue
    .line 97
    iput-object p1, p0, Lkik/android/chat/fragment/lc;->a:Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 101
    iget-object v0, p0, Lkik/android/chat/fragment/lc;->a:Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->a(Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;)V

    .line 102
    iget-object v0, p0, Lkik/android/chat/fragment/lc;->a:Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikDisplayOnlyChatInfoFragment;->o:Lcom/kik/android/a;

    const-string v1, "Joined Public Group"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 103
    return-void
.end method
