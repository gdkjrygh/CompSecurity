.class final Lkik/android/chat/fragment/qi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/qg;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/qg;)V
    .locals 0

    .prologue
    .line 96
    iput-object p1, p0, Lkik/android/chat/fragment/qi;->a:Lkik/android/chat/fragment/qg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lkik/android/chat/fragment/qi;->a:Lkik/android/chat/fragment/qg;

    iget-object v0, v0, Lkik/android/chat/fragment/qg;->a:Lkik/android/chat/fragment/MissedConversationsFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/MissedConversationsFragment;->a(Lkik/android/chat/fragment/MissedConversationsFragment;)V

    .line 101
    return-void
.end method
