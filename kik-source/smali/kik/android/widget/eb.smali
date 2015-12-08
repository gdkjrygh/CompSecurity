.class final Lkik/android/widget/eb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/widget/TalkToCoverView;


# direct methods
.method constructor <init>(Lkik/android/widget/TalkToCoverView;)V
    .locals 0

    .prologue
    .line 197
    iput-object p1, p0, Lkik/android/widget/eb;->a:Lkik/android/widget/TalkToCoverView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 201
    iget-object v0, p0, Lkik/android/widget/eb;->a:Lkik/android/widget/TalkToCoverView;

    iget-object v0, v0, Lkik/android/widget/TalkToCoverView;->d:Lkik/a/e/i;

    iget-object v1, p0, Lkik/android/widget/eb;->a:Lkik/android/widget/TalkToCoverView;

    invoke-static {v1}, Lkik/android/widget/TalkToCoverView;->e(Lkik/android/widget/TalkToCoverView;)Lkik/a/d/k;

    move-result-object v1

    invoke-virtual {v1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/i;->c(Ljava/lang/String;)V

    .line 202
    return-void
.end method
