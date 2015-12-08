.class final Lkik/android/widget/dz;
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
    .line 168
    iput-object p1, p0, Lkik/android/widget/dz;->a:Lkik/android/widget/TalkToCoverView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 172
    iget-object v0, p0, Lkik/android/widget/dz;->a:Lkik/android/widget/TalkToCoverView;

    iget-object v0, v0, Lkik/android/widget/TalkToCoverView;->c:Lkik/a/e/r;

    iget-object v1, p0, Lkik/android/widget/dz;->a:Lkik/android/widget/TalkToCoverView;

    invoke-static {v1}, Lkik/android/widget/TalkToCoverView;->e(Lkik/android/widget/TalkToCoverView;)Lkik/a/d/k;

    move-result-object v1

    invoke-virtual {v1}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/r;->c(Lkik/a/d/j;)Lcom/kik/g/p;

    .line 173
    iget-object v0, p0, Lkik/android/widget/dz;->a:Lkik/android/widget/TalkToCoverView;

    iget-object v0, v0, Lkik/android/widget/TalkToCoverView;->d:Lkik/a/e/i;

    iget-object v1, p0, Lkik/android/widget/dz;->a:Lkik/android/widget/TalkToCoverView;

    invoke-static {v1}, Lkik/android/widget/TalkToCoverView;->e(Lkik/android/widget/TalkToCoverView;)Lkik/a/d/k;

    move-result-object v1

    invoke-virtual {v1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/i;->b(Ljava/lang/String;)V

    .line 174
    iget-object v0, p0, Lkik/android/widget/dz;->a:Lkik/android/widget/TalkToCoverView;

    iget-object v0, v0, Lkik/android/widget/TalkToCoverView;->a:Lcom/kik/android/a;

    const-string v1, "Chat Screen Block Clicked"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Result"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 177
    return-void
.end method
