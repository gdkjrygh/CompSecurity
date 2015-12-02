.class Lcom/qihoo/security/opti/trashclear/ui/h$4;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/opti/trashclear/ui/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/h;->c(Lcom/qihoo/security/opti/trashclear/ui/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

.field final synthetic b:I

.field final synthetic c:Lcom/qihoo/security/opti/trashclear/ui/i;

.field final synthetic d:Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

.field final synthetic e:Lcom/qihoo/security/opti/trashclear/ui/h;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;ILcom/qihoo/security/opti/trashclear/ui/i;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V
    .locals 0

    .prologue
    .line 1176
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->e:Lcom/qihoo/security/opti/trashclear/ui/h;

    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->a:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    iput p3, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->b:I

    iput-object p4, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->c:Lcom/qihoo/security/opti/trashclear/ui/i;

    iput-object p5, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->d:Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 1247
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->e:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->e(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->a:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->a:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    iget-object v2, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->desc:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Landroid/content/Context;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Ljava/lang/String;)V

    .line 1248
    return-void
.end method

.method public a(Lcom/qihoo/security/opti/trashclear/ui/c;)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 1216
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->e:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->c(Lcom/qihoo/security/opti/trashclear/ui/h;)I

    move-result v0

    if-nez v0, :cond_0

    .line 1218
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->e:Lcom/qihoo/security/opti/trashclear/ui/h;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->c:Lcom/qihoo/security/opti/trashclear/ui/i;

    const/4 v3, 0x3

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->c:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    invoke-static {v1, v2, v3, v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo/security/opti/trashclear/ui/i;II)V

    .line 1243
    :goto_0
    return-void

    .line 1220
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->d:Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->TrashType:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    .line 1221
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->d:Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->TrashType:I

    if-nez v0, :cond_3

    .line 1222
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->a:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    iget v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    const/16 v1, 0x142

    if-ne v0, v1, :cond_2

    .line 1227
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->e:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->d(Lcom/qihoo/security/opti/trashclear/ui/h;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1228
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->e:Lcom/qihoo/security/opti/trashclear/ui/h;

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->c:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->oraginalData:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->c:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-static {v1, v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 1241
    :goto_1
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c0246

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    goto :goto_0

    .line 1230
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->e:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->e(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->a:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    iget-object v1, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->packageName:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/b/s;->d(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 1233
    :cond_2
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->e:Lcom/qihoo/security/opti/trashclear/ui/h;

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->c:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->oraginalData:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->c:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-static {v1, v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_1

    .line 1236
    :cond_3
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->e:Lcom/qihoo/security/opti/trashclear/ui/h;

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->c:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->oraginalData:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->c:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-static {v1, v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_1

    .line 1239
    :cond_4
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->e:Lcom/qihoo/security/opti/trashclear/ui/h;

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->c:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->oraginalData:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->c:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-static {v1, v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_1
.end method

.method public a(Lcom/qihoo/security/opti/trashclear/ui/c;ZLcom/qihoo/security/opti/trashclear/ui/i;Landroid/view/View;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/c;",
            "Z",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    .prologue
    const/4 v7, 0x2

    const/4 v1, 0x0

    const/4 v6, -0x1

    .line 1181
    if-eqz p3, :cond_1

    .line 1182
    const/16 v0, 0x4659

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 1185
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->e:Lcom/qihoo/security/opti/trashclear/ui/h;

    const/4 v2, 0x1

    invoke-static {v0, p3, p2, v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo/security/opti/trashclear/ui/i;ZZ)V

    .line 1186
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->a:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 1187
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->e:Lcom/qihoo/security/opti/trashclear/ui/h;

    iget-object v3, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    iget v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h$4;->b:I

    invoke-interface {p3}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v5

    invoke-interface {v5}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v5

    invoke-static {v0, v3, v4, v5, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/h;Ljava/lang/String;ILjava/util/List;Z)V

    .line 1189
    invoke-interface {p3}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 1190
    invoke-interface {p3}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    if-eq v0, v6, :cond_4

    .line 1191
    invoke-interface {p3}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    .line 1194
    :goto_0
    if-eqz p2, :cond_2

    .line 1195
    iget v1, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    if-eq v1, v7, :cond_0

    .line 1196
    add-int/lit8 v1, v0, -0x1

    .line 1197
    invoke-interface {p3}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    if-eq v0, v6, :cond_0

    .line 1198
    invoke-interface {p3}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    .line 1201
    :cond_0
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c0239

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    .line 1212
    :cond_1
    :goto_1
    return-void

    .line 1203
    :cond_2
    iget v1, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    if-eq v1, v7, :cond_3

    .line 1204
    add-int/lit8 v1, v0, 0x1

    .line 1205
    invoke-interface {p3}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    if-eq v0, v6, :cond_3

    .line 1206
    invoke-interface {p3}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    .line 1209
    :cond_3
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c023a

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    goto :goto_1

    :cond_4
    move v0, v1

    goto :goto_0
.end method

.method public b()V
    .locals 0

    .prologue
    .line 1255
    return-void
.end method
