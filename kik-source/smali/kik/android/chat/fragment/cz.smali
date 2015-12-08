.class final Lkik/android/chat/fragment/cz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/cw;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/cw;)V
    .locals 0

    .prologue
    .line 438
    iput-object p1, p0, Lkik/android/chat/fragment/cz;->a:Lkik/android/chat/fragment/cw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    .line 441
    iget-object v0, p0, Lkik/android/chat/fragment/cz;->a:Lkik/android/chat/fragment/cw;

    iget-object v0, v0, Lkik/android/chat/fragment/cw;->a:Lcom/kik/g/p;

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 442
    invoke-static {}, Lkik/android/chat/KikApplication;->i()Lkik/android/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v0

    sget-object v1, Lcom/kik/d/b/a$k;->ae:Lcom/kik/d/b/a$k;

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    const-string v6, "url"

    aput-object v6, v4, v5

    iget-object v5, p0, Lkik/android/chat/fragment/cz;->a:Lkik/android/chat/fragment/cw;

    iget-object v5, v5, Lkik/android/chat/fragment/cw;->b:Ljava/lang/String;

    aput-object v5, v4, v7

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;J[Ljava/lang/Object;)V

    .line 445
    return-void
.end method
