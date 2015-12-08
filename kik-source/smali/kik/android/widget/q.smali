.class final Lkik/android/widget/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/ContentLinkView;


# direct methods
.method constructor <init>(Lkik/android/widget/ContentLinkView;)V
    .locals 0

    .prologue
    .line 54
    iput-object p1, p0, Lkik/android/widget/q;->a:Lkik/android/widget/ContentLinkView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 59
    iget-object v0, p0, Lkik/android/widget/q;->a:Lkik/android/widget/ContentLinkView;

    invoke-static {v0}, Lkik/android/widget/ContentLinkView;->c(Lkik/android/widget/ContentLinkView;)Lkik/android/b/g;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/q;->a:Lkik/android/widget/ContentLinkView;

    invoke-virtual {v1}, Lkik/android/widget/ContentLinkView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lkik/android/widget/q;->a:Lkik/android/widget/ContentLinkView;

    invoke-static {v2}, Lkik/android/widget/ContentLinkView;->a(Lkik/android/widget/ContentLinkView;)Lcom/kik/f/a/a/a;

    move-result-object v2

    iget-object v3, p0, Lkik/android/widget/q;->a:Lkik/android/widget/ContentLinkView;

    invoke-static {v3}, Lkik/android/widget/ContentLinkView;->b(Lkik/android/widget/ContentLinkView;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lkik/android/b/g;->a(Landroid/content/Context;Lcom/kik/f/a/a/a;I)Lcom/kik/g/p;

    move-result-object v0

    .line 60
    new-instance v1, Lkik/android/widget/r;

    invoke-direct {v1, p0}, Lkik/android/widget/r;-><init>(Lkik/android/widget/q;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 113
    return-void
.end method
