.class Lcom/qihoo360/mobilesafe/core/b$a;
.super Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/mobilesafe/core/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field c:Z

.field d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;"
        }
    .end annotation
.end field

.field e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;"
        }
    .end annotation
.end field

.field f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic g:Lcom/qihoo360/mobilesafe/core/b;

.field private h:Lcom/qihoo360/mobilesafe/core/b/d;


# direct methods
.method public constructor <init>(Lcom/qihoo360/mobilesafe/core/b;ZLcom/qihoo360/mobilesafe/core/b/d;)V
    .locals 0

    .prologue
    .line 80
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;-><init>()V

    .line 81
    iput-boolean p2, p0, Lcom/qihoo360/mobilesafe/core/b$a;->c:Z

    .line 82
    iput-object p3, p0, Lcom/qihoo360/mobilesafe/core/b$a;->h:Lcom/qihoo360/mobilesafe/core/b/d;

    .line 83
    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/qihoo360/mobilesafe/core/b$a;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 12

    .prologue
    const/4 v4, 0x0

    const/4 v11, 0x3

    const/4 v10, 0x2

    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 104
    .line 109
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/core/b;->b()V

    .line 111
    new-array v0, v9, [Ljava/lang/Integer;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v8

    invoke-virtual {p0, v0}, Lcom/qihoo360/mobilesafe/core/b$a;->c([Ljava/lang/Object;)V

    .line 112
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/b;->a(Lcom/qihoo360/mobilesafe/core/b;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/b;->b(Lcom/qihoo360/mobilesafe/core/b;)Landroid/app/ActivityManager;

    move-result-object v1

    .line 113
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    invoke-static {v2}, Lcom/qihoo360/mobilesafe/core/b;->c(Lcom/qihoo360/mobilesafe/core/b;)Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 112
    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/core/d/c;->a(Landroid/content/Context;Landroid/app/ActivityManager;Landroid/content/pm/PackageManager;)Ljava/util/List;

    move-result-object v1

    .line 114
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 115
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 120
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 124
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/qihoo360/mobilesafe/core/b$a;->d:Ljava/util/List;

    .line 126
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/qihoo360/mobilesafe/core/b$a;->e:Ljava/util/List;

    .line 128
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/qihoo360/mobilesafe/core/b$a;->f:Ljava/util/List;

    .line 131
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    invoke-static {v2}, Lcom/qihoo360/mobilesafe/core/b;->a(Lcom/qihoo360/mobilesafe/core/b;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/qihoo360/mobilesafe/core/b/e;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/core/b/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/qihoo360/mobilesafe/core/b/e;->a()V

    .line 133
    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    .line 135
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    invoke-static {v2}, Lcom/qihoo360/mobilesafe/core/b;->d(Lcom/qihoo360/mobilesafe/core/b;)Lcom/qihoo360/mobilesafe/core/b/b;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    invoke-static {v3}, Lcom/qihoo360/mobilesafe/core/b;->a(Lcom/qihoo360/mobilesafe/core/b;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lcom/qihoo360/mobilesafe/core/b/b;->a(Ljava/util/List;Landroid/content/Context;)Ljava/util/List;

    move-result-object v3

    .line 136
    if-eqz v3, :cond_d

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x4

    if-ne v0, v2, :cond_d

    .line 137
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 138
    iget-object v6, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    iget-object v7, p0, Lcom/qihoo360/mobilesafe/core/b$a;->e:Ljava/util/List;

    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v6, v7, v2}, Lcom/qihoo360/mobilesafe/core/b;->a(Lcom/qihoo360/mobilesafe/core/b;Ljava/util/List;Ljava/util/List;)V

    .line 139
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 141
    iget-object v6, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    invoke-static {v6}, Lcom/qihoo360/mobilesafe/core/b;->a(Lcom/qihoo360/mobilesafe/core/b;)Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lcom/qihoo360/mobilesafe/core/b/e;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/core/b/e;

    move-result-object v6

    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v6, v3}, Lcom/qihoo360/mobilesafe/core/b/e;->a(Ljava/util/List;)V

    move-object v3, v0

    .line 148
    :goto_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/b;->e(Lcom/qihoo360/mobilesafe/core/b;)Lcom/qihoo360/mobilesafe/core/b/c;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo360/mobilesafe/core/b/c;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    .line 150
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v11, :cond_0

    .line 151
    iget-object v6, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    iget-object v7, p0, Lcom/qihoo360/mobilesafe/core/b$a;->d:Ljava/util/List;

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v6, v7, v0}, Lcom/qihoo360/mobilesafe/core/b;->a(Lcom/qihoo360/mobilesafe/core/b;Ljava/util/List;Ljava/util/List;)V

    .line 152
    iget-object v6, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    iget-object v7, p0, Lcom/qihoo360/mobilesafe/core/b$a;->e:Ljava/util/List;

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v6, v7, v0}, Lcom/qihoo360/mobilesafe/core/b;->a(Lcom/qihoo360/mobilesafe/core/b;Ljava/util/List;Ljava/util/List;)V

    .line 153
    iget-object v6, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v6, v5, v0}, Lcom/qihoo360/mobilesafe/core/b;->a(Lcom/qihoo360/mobilesafe/core/b;Ljava/util/List;Ljava/util/List;)V

    .line 160
    :cond_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/b;->e(Lcom/qihoo360/mobilesafe/core/b;)Lcom/qihoo360/mobilesafe/core/b/c;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/qihoo360/mobilesafe/core/b/c;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    .line 161
    if-eqz v2, :cond_1

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v11, :cond_1

    .line 162
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    iget-object v6, p0, Lcom/qihoo360/mobilesafe/core/b$a;->d:Ljava/util/List;

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v3, v6, v0}, Lcom/qihoo360/mobilesafe/core/b;->a(Lcom/qihoo360/mobilesafe/core/b;Ljava/util/List;Ljava/util/List;)V

    .line 163
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    iget-object v6, p0, Lcom/qihoo360/mobilesafe/core/b$a;->e:Ljava/util/List;

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v3, v6, v0}, Lcom/qihoo360/mobilesafe/core/b;->a(Lcom/qihoo360/mobilesafe/core/b;Ljava/util/List;Ljava/util/List;)V

    .line 164
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v3, v5, v0}, Lcom/qihoo360/mobilesafe/core/b;->a(Lcom/qihoo360/mobilesafe/core/b;Ljava/util/List;Ljava/util/List;)V

    .line 171
    :cond_1
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/b;->d(Lcom/qihoo360/mobilesafe/core/b;)Lcom/qihoo360/mobilesafe/core/b/b;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    invoke-static {v2}, Lcom/qihoo360/mobilesafe/core/b;->a(Lcom/qihoo360/mobilesafe/core/b;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v5, v2}, Lcom/qihoo360/mobilesafe/core/b/b;->b(Ljava/util/List;Landroid/content/Context;)Ljava/util/List;

    move-result-object v2

    .line 172
    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v10, :cond_2

    .line 173
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    iget-object v5, p0, Lcom/qihoo360/mobilesafe/core/b$a;->e:Ljava/util/List;

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v3, v5, v0}, Lcom/qihoo360/mobilesafe/core/b;->a(Lcom/qihoo360/mobilesafe/core/b;Ljava/util/List;Ljava/util/List;)V

    .line 175
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/b;->a(Lcom/qihoo360/mobilesafe/core/b;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/b/e;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/core/b/e;

    move-result-object v3

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {v3, v0}, Lcom/qihoo360/mobilesafe/core/b/e;->a(Ljava/util/List;)V

    .line 202
    :cond_2
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->d:Ljava/util/List;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 203
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_a

    .line 211
    :cond_4
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->e:Ljava/util/List;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 212
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_b

    .line 224
    :cond_6
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->f:Ljava/util/List;

    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    invoke-static {v2}, Lcom/qihoo360/mobilesafe/core/b;->a(Lcom/qihoo360/mobilesafe/core/b;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/qihoo360/mobilesafe/core/b/e;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/core/b/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/qihoo360/mobilesafe/core/b/e;->e()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 227
    if-eqz v1, :cond_8

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 228
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_c

    .line 240
    :cond_8
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->c:Z

    if-eqz v0, :cond_9

    .line 241
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b$a;->d:Ljava/util/List;

    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/b$a;->e:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/core/b;->b(Lcom/qihoo360/mobilesafe/core/b;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 248
    :cond_9
    return-object v4

    .line 203
    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    .line 204
    if-eqz v0, :cond_3

    .line 205
    iput v8, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    goto :goto_1

    .line 212
    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    .line 213
    if-eqz v0, :cond_5

    .line 214
    iput v11, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    .line 216
    iget-object v3, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    .line 217
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/core/b$a;->f:Ljava/util/List;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 228
    :cond_c
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;

    .line 229
    iget-object v0, v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    .line 230
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_7

    .line 231
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/b$a;->f:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_d
    move-object v2, v4

    move-object v3, v4

    goto/16 :goto_0
.end method

.method protected a()V
    .locals 1

    .prologue
    .line 87
    invoke-super {p0}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->a()V

    .line 89
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/core/b;->d()V

    .line 90
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->h:Lcom/qihoo360/mobilesafe/core/b/d;

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->h:Lcom/qihoo360/mobilesafe/core/b/d;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/core/b/d;->a()V

    .line 97
    :cond_0
    return-void
.end method

.method protected bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/qihoo360/mobilesafe/core/b$a;->a(Ljava/lang/Void;)V

    return-void
.end method

.method protected a(Ljava/lang/Void;)V
    .locals 3

    .prologue
    .line 261
    invoke-super {p0, p1}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->a(Ljava/lang/Object;)V

    .line 263
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->g:Lcom/qihoo360/mobilesafe/core/b;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/core/b;->c()V

    .line 267
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->h:Lcom/qihoo360/mobilesafe/core/b/d;

    if-eqz v0, :cond_0

    .line 268
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->h:Lcom/qihoo360/mobilesafe/core/b/d;

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b$a;->d:Ljava/util/List;

    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/b$a;->e:Ljava/util/List;

    invoke-interface {v0, v1, v2}, Lcom/qihoo360/mobilesafe/core/b/d;->a(Ljava/util/List;Ljava/util/List;)V

    .line 269
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->h:Lcom/qihoo360/mobilesafe/core/b/d;

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/b$a;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/core/b/d;->a(Ljava/util/List;)V

    .line 271
    :cond_0
    return-void
.end method

.method protected varargs a([Ljava/lang/Integer;)V
    .locals 1

    .prologue
    .line 253
    invoke-super {p0, p1}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->b([Ljava/lang/Object;)V

    .line 254
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->h:Lcom/qihoo360/mobilesafe/core/b/d;

    if-eqz v0, :cond_0

    .line 255
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/b$a;->h:Lcom/qihoo360/mobilesafe/core/b/d;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/core/b/d;->b()V

    .line 257
    :cond_0
    return-void
.end method

.method protected varargs synthetic b([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/qihoo360/mobilesafe/core/b$a;->a([Ljava/lang/Integer;)V

    return-void
.end method
