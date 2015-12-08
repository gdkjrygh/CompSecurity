.class final Lkik/android/chat/fragment/ro;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lkik/android/chat/fragment/rl;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/rl;I)V
    .locals 0

    .prologue
    .line 160
    iput-object p1, p0, Lkik/android/chat/fragment/ro;->b:Lkik/android/chat/fragment/rl;

    iput p2, p0, Lkik/android/chat/fragment/ro;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/chat/fragment/ro;->b:Lkik/android/chat/fragment/rl;

    invoke-static {v0}, Lkik/android/chat/fragment/rl;->a(Lkik/android/chat/fragment/rl;)Lkik/android/chat/fragment/rl$a;

    move-result-object v1

    iget-object v0, p0, Lkik/android/chat/fragment/ro;->b:Lkik/android/chat/fragment/rl;

    invoke-static {v0}, Lkik/android/chat/fragment/rl;->b(Lkik/android/chat/fragment/rl;)Ljava/util/List;

    move-result-object v0

    iget v2, p0, Lkik/android/chat/fragment/ro;->a:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/z;

    invoke-virtual {v0}, Lkik/a/d/z;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lkik/android/chat/fragment/rl$a;->a(Ljava/lang/String;)V

    .line 165
    return-void
.end method
