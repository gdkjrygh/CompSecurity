.class Lcom/qihoo/security/opti/b/b$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/enginehelper/clean/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/b/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/b/b;

.field private b:J


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/b/b;)V
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/qihoo/security/opti/b/b$1;->a:Lcom/qihoo/security/opti/b/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/qihoo/security/opti/trashclear/d;)V
    .locals 2

    .prologue
    .line 101
    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/qihoo/security/opti/trashclear/d;->k:Lcom/qihoo/security/opti/trashclear/e$a;

    if-eqz v0, :cond_0

    .line 102
    iget-object v0, p1, Lcom/qihoo/security/opti/trashclear/d;->k:Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/e$a;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/opti/b/b$1;->b:J

    .line 104
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 49
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/opti/b/b$1;->b:J

    .line 50
    return-void
.end method

.method public a(ILjava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Lcom/qihoo/security/clearengine/surface/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 56
    return-void
.end method

.method public a(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 61
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 96
    iget-object v0, p0, Lcom/qihoo/security/opti/b/b$1;->a:Lcom/qihoo/security/opti/b/b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/b/b;->a(Lcom/qihoo/security/opti/b/b;Z)Z

    .line 97
    iget-object v0, p0, Lcom/qihoo/security/opti/b/b$1;->a:Lcom/qihoo/security/opti/b/b;

    invoke-static {v0}, Lcom/qihoo/security/opti/b/b;->b(Lcom/qihoo/security/opti/b/b;)Lcom/qihoo/security/enginehelper/clean/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/enginehelper/clean/a;->f()V

    .line 98
    return-void
.end method

.method public b(ILjava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Lcom/qihoo/security/clearengine/surface/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 65
    invoke-static {p1, p2}, Lcom/qihoo/security/opti/trashclear/e;->a(ILjava/util/Map;)Lcom/qihoo/security/opti/trashclear/d;

    move-result-object v0

    .line 72
    iget-object v1, p0, Lcom/qihoo/security/opti/b/b$1;->a:Lcom/qihoo/security/opti/b/b;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/qihoo/security/opti/b/b;->a(Lcom/qihoo/security/opti/b/b;Z)Z

    .line 73
    iget-object v1, p0, Lcom/qihoo/security/opti/b/b$1;->a:Lcom/qihoo/security/opti/b/b;

    invoke-static {v1}, Lcom/qihoo/security/opti/b/b;->a(Lcom/qihoo/security/opti/b/b;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 74
    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/b/b$1;->a(Lcom/qihoo/security/opti/trashclear/d;)V

    .line 75
    iget-wide v0, p0, Lcom/qihoo/security/opti/b/b$1;->b:J

    invoke-static {}, Lcom/qihoo/security/opti/b/b;->f()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    invoke-static {}, Lcom/qihoo/security/opti/b/b;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 76
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/b/b$1;->a:Lcom/qihoo/security/opti/b/b;

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v1

    iget-wide v2, p0, Lcom/qihoo/security/opti/b/b$1;->b:J

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lcom/qihoo/security/opti/b/d;->a(Landroid/content/Context;JZ)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/b/b;->a(Lcom/qihoo/security/opti/b/b;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    iget-object v0, p0, Lcom/qihoo/security/opti/b/b$1;->a:Lcom/qihoo/security/opti/b/b;

    iget-wide v2, p0, Lcom/qihoo/security/opti/b/b$1;->b:J

    long-to-float v1, v2

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/a;->a(F)I

    move-result v1

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/a;->a(I)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/b/b;->a(Lcom/qihoo/security/opti/b/b;Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 87
    :cond_1
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 91
    iget-object v0, p0, Lcom/qihoo/security/opti/b/b$1;->a:Lcom/qihoo/security/opti/b/b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/b/b;->a(Lcom/qihoo/security/opti/b/b;Z)Z

    .line 92
    return-void
.end method
