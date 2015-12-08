.class final Lkik/android/a/c;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/a/b;


# direct methods
.method constructor <init>(Lkik/android/a/b;)V
    .locals 0

    .prologue
    .line 117
    iput-object p1, p0, Lkik/android/a/c;->a:Lkik/android/a/b;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 117
    iget-object v0, p0, Lkik/android/a/c;->a:Lkik/android/a/b;

    iget-object v0, v0, Lkik/android/a/b;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/a/c;->a:Lkik/android/a/b;

    iget-boolean v0, v0, Lkik/android/a/b;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/a/c;->a:Lkik/android/a/b;

    iget-boolean v0, v0, Lkik/android/a/b;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/a/c;->a:Lkik/android/a/b;

    invoke-virtual {v0}, Lkik/android/a/b;->a()V

    :cond_0
    iget-object v0, p0, Lkik/android/a/c;->a:Lkik/android/a/b;

    invoke-virtual {v0}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/d/f;->c()J

    move-result-wide v0

    const-wide/32 v2, 0xa4cb80

    add-long/2addr v0, v2

    invoke-static {}, Lcom/kik/sdkutils/ab;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    iget-object v0, p0, Lkik/android/a/c;->a:Lkik/android/a/b;

    invoke-static {v0}, Lkik/android/a/b;->a(Lkik/android/a/b;)Lkik/android/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/a/a;->b()V

    :cond_1
    return-void
.end method
