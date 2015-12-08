.class final Lkik/android/b/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Lkik/a/d/s;

.field final synthetic b:Lkik/android/b/g;


# direct methods
.method constructor <init>(Lkik/android/b/g;Lkik/a/d/s;)V
    .locals 0

    .prologue
    .line 204
    iput-object p1, p0, Lkik/android/b/i;->b:Lkik/android/b/g;

    iput-object p2, p0, Lkik/android/b/i;->a:Lkik/a/d/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .prologue
    .line 204
    check-cast p1, Landroid/content/Intent;

    const-string v23, "CardLauncher.EXTRA_KIK_MESSAGE"

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/b/i;->a:Lkik/a/d/s;

    const-class v2, Lkik/a/d/a/a;

    invoke-static {v7, v2}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v2

    move-object/from16 v22, v2

    check-cast v22, Lkik/a/d/a/a;

    if-eqz v22, :cond_0

    new-instance v2, Lcom/kik/cards/web/kik/KikMessageParcelable;

    const-string v3, "title"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "text"

    move-object/from16 v0, v22

    invoke-virtual {v0, v4}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual {v7}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v22 .. v22}, Lkik/android/util/ae;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "card-url"

    move-object/from16 v0, v22

    invoke-virtual {v0, v11}, Lkik/a/d/a/a;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "card-icon"

    move-object/from16 v0, v22

    invoke-virtual {v0, v12}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "allow-forward"

    move-object/from16 v0, v22

    invoke-virtual {v0, v13}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v14, "fallbackUrl"

    move-object/from16 v0, v22

    invoke-virtual {v0, v14}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v15, "pngImage"

    move-object/from16 v0, v22

    invoke-virtual {v0, v15}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v16, "attribution"

    move-object/from16 v0, v22

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v22 .. v22}, Lkik/a/d/a/a;->h()Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v22 .. v22}, Lkik/a/d/a/a;->y()Z

    move-result v18

    invoke-static/range {v18 .. v18}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v18

    invoke-virtual/range {v22 .. v22}, Lkik/a/d/a/a;->A()Z

    move-result v19

    invoke-static/range {v19 .. v19}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {v22 .. v22}, Lkik/a/d/a/a;->z()Z

    move-result v20

    invoke-static/range {v20 .. v20}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v20

    invoke-virtual/range {v22 .. v22}, Lkik/a/d/a/a;->x()Z

    move-result v21

    invoke-static/range {v21 .. v21}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v21

    invoke-direct/range {v2 .. v21}, Lcom/kik/cards/web/kik/KikMessageParcelable;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {v22 .. v22}, Lkik/a/d/a/a;->q()Ljava/util/Hashtable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Hashtable;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    iget-object v6, v2, Lcom/kik/cards/web/kik/KikMessageParcelable;->t:Ljava/util/HashMap;

    move-object v3, v4

    check-cast v3, Ljava/lang/String;

    invoke-virtual/range {v22 .. v22}, Lkik/a/d/a/a;->q()Ljava/util/Hashtable;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    move-object/from16 v0, p1

    move-object/from16 v1, v23

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object p1
.end method
