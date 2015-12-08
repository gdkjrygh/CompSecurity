.class final Lkik/android/widget/dv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/TalkToCoverView;


# direct methods
.method constructor <init>(Lkik/android/widget/TalkToCoverView;)V
    .locals 0

    .prologue
    .line 16
    iput-object p1, p0, Lkik/android/widget/dv;->a:Lkik/android/widget/TalkToCoverView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lkik/android/widget/dv;->a:Lkik/android/widget/TalkToCoverView;

    invoke-virtual {v0}, Lkik/android/widget/TalkToCoverView;->deleteConversation()V

    .line 21
    return-void
.end method
