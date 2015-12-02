.class Lcom/qihoo/utils/notice/b$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/app/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/utils/notice/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/utils/notice/b;


# direct methods
.method constructor <init>(Lcom/qihoo/utils/notice/b;)V
    .locals 0

    .prologue
    .line 104
    iput-object p1, p0, Lcom/qihoo/utils/notice/b$1;->a:Lcom/qihoo/utils/notice/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 0

    .prologue
    .line 138
    return-void
.end method

.method public a(Ljava/util/List;Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/opti/a/a$a;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    .line 107
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$1;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->a(Lcom/qihoo/utils/notice/b;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 108
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$1;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->b(Lcom/qihoo/utils/notice/b;)V

    .line 109
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 110
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$1;->a:Lcom/qihoo/utils/notice/b;

    const-wide/16 v2, 0x0

    invoke-static {v0, v2, v3}, Lcom/qihoo/utils/notice/b;->a(Lcom/qihoo/utils/notice/b;J)J

    .line 111
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 112
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    .line 113
    iget v3, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    if-nez v3, :cond_0

    .line 114
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 115
    iget-object v3, p0, Lcom/qihoo/utils/notice/b$1;->a:Lcom/qihoo/utils/notice/b;

    iget v0, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->useMemory:I

    int-to-long v4, v0

    invoke-static {v3, v4, v5}, Lcom/qihoo/utils/notice/b;->b(Lcom/qihoo/utils/notice/b;J)J

    goto :goto_0

    .line 118
    :cond_1
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$1;->a:Lcom/qihoo/utils/notice/b;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v0, v2}, Lcom/qihoo/utils/notice/b;->a(Lcom/qihoo/utils/notice/b;I)I

    .line 119
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$1;->a:Lcom/qihoo/utils/notice/b;

    invoke-static {v0}, Lcom/qihoo/utils/notice/b;->c(Lcom/qihoo/utils/notice/b;)Ljava/util/Comparator;

    move-result-object v0

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 120
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    .line 121
    iget v1, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->useMemory:I

    int-to-long v2, v1

    .line 122
    const-string/jumbo v1, "com.qihoo.security.lite"

    iget-object v4, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-wide/16 v4, 0x19

    div-long/2addr v2, v4

    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->c()J

    move-result-wide v4

    const-wide/16 v6, 0x64

    div-long/2addr v4, v6

    cmp-long v1, v2, v4

    if-lez v1, :cond_3

    .line 123
    iget-object v1, p0, Lcom/qihoo/utils/notice/b$1;->a:Lcom/qihoo/utils/notice/b;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/qihoo/utils/notice/b;->a(Lcom/qihoo/utils/notice/b;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    :cond_2
    :goto_1
    return-void

    .line 125
    :cond_3
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$1;->a:Lcom/qihoo/utils/notice/b;

    const-string/jumbo v1, ""

    invoke-static {v0, v1}, Lcom/qihoo/utils/notice/b;->a(Lcom/qihoo/utils/notice/b;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_1
.end method
