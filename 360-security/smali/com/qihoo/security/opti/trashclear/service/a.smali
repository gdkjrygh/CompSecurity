.class public Lcom/qihoo/security/opti/trashclear/service/a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/opti/trashclear/service/c;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/qihoo/security/opti/trashclear/service/b;

.field private d:Ljava/lang/String;

.field private final e:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 25
    const-class v0, Lcom/qihoo/security/opti/trashclear/service/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/opti/trashclear/service/a;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/service/a;->e:Landroid/content/Context;

    .line 39
    return-void
.end method


# virtual methods
.method public a()V
    .locals 14

    .prologue
    const-wide/16 v2, 0x0

    const/4 v7, 0x0

    .line 44
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/a;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 96
    :goto_0
    return-void

    .line 49
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/a;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/a/a/a/c;->e(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/opti/i/appclear/IClearApp;

    move-result-object v0

    .line 51
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 52
    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/service/a;->d:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/opti/i/appclear/IClearApp;->scanUninstalledAppTrash(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/a;->b:Ljava/util/List;

    .line 57
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/a;->b:Ljava/util/List;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 58
    const-string/jumbo v1, ""

    .line 61
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v8, v0

    move-wide v4, v2

    :goto_1
    if-ltz v8, :cond_4

    .line 62
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/a;->b:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 63
    if-nez v0, :cond_1

    move-wide v12, v2

    move-wide v2, v4

    move-object v4, v1

    move-wide v0, v12

    .line 61
    :goto_2
    add-int/lit8 v5, v8, -0x1

    move v8, v5

    move-wide v12, v0

    move-object v1, v4

    move-wide v4, v2

    move-wide v2, v12

    goto :goto_1

    .line 65
    :cond_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 66
    iget-object v6, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->desc:Ljava/lang/String;

    .line 69
    :goto_3
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    if-eqz v1, :cond_7

    .line 70
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v9, "subList"

    invoke-virtual {v1, v9}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    .line 71
    :goto_4
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-lez v9, :cond_3

    .line 72
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 73
    iget-wide v10, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    add-long/2addr v4, v10

    .line 74
    iget-wide v10, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->count:J

    add-long/2addr v2, v10

    .line 75
    goto :goto_5

    :cond_2
    move-wide v0, v2

    move-wide v2, v4

    move-object v4, v6

    goto :goto_2

    .line 77
    :cond_3
    iget-wide v10, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    add-long/2addr v4, v10

    .line 78
    iget-wide v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->count:J

    add-long/2addr v0, v2

    move-wide v2, v4

    move-object v4, v6

    goto :goto_2

    .line 82
    :cond_4
    new-instance v0, Lcom/qihoo/security/opti/trashclear/service/b;

    invoke-direct {v0}, Lcom/qihoo/security/opti/trashclear/service/b;-><init>()V

    .line 83
    if-nez v1, :cond_5

    const-string/jumbo v1, ""

    :cond_5
    iput-object v1, v0, Lcom/qihoo/security/opti/trashclear/service/b;->a:Ljava/lang/String;

    .line 84
    iput-wide v4, v0, Lcom/qihoo/security/opti/trashclear/service/b;->b:J

    .line 85
    iput-wide v2, v0, Lcom/qihoo/security/opti/trashclear/service/b;->c:J

    .line 87
    :goto_6
    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/a;->c:Lcom/qihoo/security/opti/trashclear/service/b;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 91
    :catch_0
    move-exception v0

    goto/16 :goto_0

    :cond_6
    move-object v6, v1

    goto :goto_3

    :cond_7
    move-object v1, v7

    goto :goto_4

    :cond_8
    move-object v0, v7

    goto :goto_6
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 133
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/service/a;->d:Ljava/lang/String;

    .line 134
    return-void
.end method

.method public b()Lcom/qihoo/security/opti/trashclear/service/b;
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/a;->c:Lcom/qihoo/security/opti/trashclear/service/b;

    return-object v0
.end method

.method public c()V
    .locals 2

    .prologue
    .line 118
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/a;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/a/a/a/c;->e(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/opti/i/appclear/IClearApp;

    move-result-object v0

    .line 119
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/service/a;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/opti/i/appclear/IClearApp;->clearUninstalledAppTrash(Ljava/util/List;)I

    .line 125
    return-void
.end method
