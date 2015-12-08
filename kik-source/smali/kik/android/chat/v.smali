.class final Lkik/android/chat/v;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/KikApplication;


# direct methods
.method constructor <init>(Lkik/android/chat/KikApplication;)V
    .locals 0

    .prologue
    .line 1182
    iput-object p1, p0, Lkik/android/chat/v;->a:Lkik/android/chat/KikApplication;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 1186
    iget-object v0, p0, Lkik/android/chat/v;->a:Lkik/android/chat/KikApplication;

    invoke-virtual {v0}, Lkik/android/chat/KikApplication;->l()V

    .line 1188
    iget-object v0, p0, Lkik/android/chat/v;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->w(Lkik/android/chat/KikApplication;)Lcom/kik/g/k;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1190
    iget-object v0, p0, Lkik/android/chat/v;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->x(Lkik/android/chat/KikApplication;)Z

    .line 1191
    iget-object v0, p0, Lkik/android/chat/v;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->c(Lkik/android/chat/KikApplication;)Lkik/android/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/d/f;->b()V

    .line 1192
    iget-object v0, p0, Lkik/android/chat/v;->a:Lkik/android/chat/KikApplication;

    iget-object v0, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    invoke-virtual {v0}, Lcom/kik/android/a;->d()Lcom/kik/android/a;

    .line 1193
    return-void
.end method
