.class final Lkik/android/chat/fragment/cy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/cw;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/cw;)V
    .locals 0

    .prologue
    .line 428
    iput-object p1, p0, Lkik/android/chat/fragment/cy;->a:Lkik/android/chat/fragment/cw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 432
    iget-object v0, p0, Lkik/android/chat/fragment/cy;->a:Lkik/android/chat/fragment/cw;

    iget-object v0, v0, Lkik/android/chat/fragment/cw;->a:Lcom/kik/g/p;

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 433
    invoke-static {}, Lkik/android/chat/KikApplication;->i()Lkik/android/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v0

    sget-object v1, Lcom/kik/d/b/a$k;->af:Lcom/kik/d/b/a$k;

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "url"

    aput-object v5, v4, v6

    const/4 v5, 0x1

    iget-object v6, p0, Lkik/android/chat/fragment/cy;->a:Lkik/android/chat/fragment/cw;

    iget-object v6, v6, Lkik/android/chat/fragment/cw;->b:Ljava/lang/String;

    aput-object v6, v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;J[Ljava/lang/Object;)V

    .line 436
    return-void
.end method
