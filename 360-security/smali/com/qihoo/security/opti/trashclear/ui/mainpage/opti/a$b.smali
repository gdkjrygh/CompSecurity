.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;
.super Lcom/android/core/AsyncTask;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/android/core/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;

.field private final g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 76
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;

    invoke-direct {p0}, Lcom/android/core/AsyncTask;-><init>()V

    .line 74
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->g:Ljava/util/HashMap;

    .line 77
    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->f:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;

    .line 78
    iput-object p4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->d:Ljava/lang/String;

    .line 79
    iput-object p5, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->e:Ljava/lang/String;

    .line 80
    invoke-virtual {p0, p2, p3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;Ljava/lang/String;)V

    .line 81
    return-void
.end method


# virtual methods
.method protected bridge synthetic a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 69
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->a([Ljava/lang/String;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs a([Ljava/lang/String;)Ljava/lang/Void;
    .locals 4

    .prologue
    .line 98
    const-string/jumbo v0, ""

    .line 99
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/b/i;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/b/i;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 104
    :goto_0
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->d:Ljava/lang/String;

    new-instance v3, Ljava/lang/ref/SoftReference;

    invoke-direct {v3, v0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-virtual {p0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->d([Ljava/lang/Object;)V

    .line 106
    const/4 v0, 0x0

    return-object v0

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/b/i;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method protected a()V
    .locals 0

    .prologue
    .line 93
    invoke-super {p0}, Lcom/android/core/AsyncTask;->a()V

    .line 94
    return-void
.end method

.method public a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 84
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->g:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    :goto_0
    return-void

    .line 87
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->g:Ljava/util/HashMap;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method protected bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 69
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->a(Ljava/lang/Void;)V

    return-void
.end method

.method protected a(Ljava/lang/Void;)V
    .locals 0

    .prologue
    .line 124
    invoke-super {p0, p1}, Lcom/android/core/AsyncTask;->a(Ljava/lang/Object;)V

    .line 125
    return-void
.end method

.method protected bridge synthetic b([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 69
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->b([Ljava/lang/String;)V

    return-void
.end method

.method protected varargs b([Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 111
    invoke-super {p0, p1}, Lcom/android/core/AsyncTask;->b([Ljava/lang/Object;)V

    .line 112
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->f:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;

    if-eqz v0, :cond_0

    .line 113
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->g:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 114
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 116
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;

    const/4 v2, 0x0

    aget-object v2, p1, v2

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->d:Ljava/lang/String;

    invoke-interface {v0, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 119
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;Ljava/lang/String;)V

    .line 120
    return-void
.end method
