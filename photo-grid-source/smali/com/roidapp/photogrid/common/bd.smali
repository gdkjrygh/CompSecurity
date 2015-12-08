.class public final Lcom/roidapp/photogrid/common/bd;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/roidapp/cloudlib/template/d;)V
    .locals 22

    .prologue
    .line 17
    .line 1043
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/cloudlib/template/d;->b:Ljava/lang/String;

    .line 1047
    move-object/from16 v0, p0

    iget v2, v0, Lcom/roidapp/cloudlib/template/d;->c:I

    .line 1055
    move-object/from16 v0, p0

    iget-boolean v4, v0, Lcom/roidapp/cloudlib/template/d;->e:Z

    .line 1059
    move-object/from16 v0, p0

    iget-boolean v5, v0, Lcom/roidapp/cloudlib/template/d;->f:Z

    .line 1063
    move-object/from16 v0, p0

    iget-boolean v6, v0, Lcom/roidapp/cloudlib/template/d;->g:Z

    .line 1067
    move-object/from16 v0, p0

    iget v7, v0, Lcom/roidapp/cloudlib/template/d;->h:F

    .line 1071
    move-object/from16 v0, p0

    iget v8, v0, Lcom/roidapp/cloudlib/template/d;->i:F

    .line 1075
    move-object/from16 v0, p0

    iget v9, v0, Lcom/roidapp/cloudlib/template/d;->j:F

    .line 1079
    move-object/from16 v0, p0

    iget v10, v0, Lcom/roidapp/cloudlib/template/d;->k:F

    .line 1083
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/roidapp/cloudlib/template/d;->l:Ljava/util/List;

    .line 1103
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/roidapp/cloudlib/template/d;->q:Ljava/util/List;

    .line 1107
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/roidapp/cloudlib/template/d;->r:Ljava/util/List;

    .line 1111
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/roidapp/cloudlib/template/d;->s:Ljava/util/List;

    .line 2087
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/roidapp/cloudlib/template/d;->m:Ljava/util/List;

    .line 2091
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/roidapp/cloudlib/template/d;->n:Ljava/util/List;

    move-object/from16 v16, v0

    .line 2095
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/roidapp/cloudlib/template/d;->o:Ljava/util/List;

    move-object/from16 v17, v0

    .line 2099
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/roidapp/cloudlib/template/d;->p:Ljava/util/List;

    move-object/from16 v18, v0

    .line 2115
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/roidapp/cloudlib/template/d;->t:Ljava/util/List;

    move-object/from16 v19, v0

    .line 36
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v20

    .line 37
    const/16 v21, 0x1

    invoke-virtual/range {v20 .. v21}, Lcom/roidapp/photogrid/release/ih;->e(Z)V

    .line 38
    move-object/from16 v0, v20

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a(Lcom/roidapp/cloudlib/template/d;)V

    .line 39
    move-object/from16 v0, v20

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->c(Ljava/lang/String;)V

    .line 40
    move-object/from16 v0, v20

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->e(Ljava/lang/String;)V

    .line 41
    move-object/from16 v0, v20

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->a(Z)V

    .line 42
    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->b(Z)V

    .line 43
    move-object/from16 v0, v20

    invoke-virtual {v0, v6}, Lcom/roidapp/photogrid/release/ih;->c(Z)V

    .line 44
    move-object/from16 v0, v20

    invoke-virtual {v0, v11}, Lcom/roidapp/photogrid/release/ih;->a(Ljava/util/List;)V

    .line 45
    move-object/from16 v0, v20

    invoke-virtual {v0, v12}, Lcom/roidapp/photogrid/release/ih;->b(Ljava/util/List;)V

    .line 46
    move-object/from16 v0, v20

    invoke-virtual {v0, v13}, Lcom/roidapp/photogrid/release/ih;->c(Ljava/util/List;)V

    .line 47
    move-object/from16 v0, v20

    invoke-virtual {v0, v14}, Lcom/roidapp/photogrid/release/ih;->d(Ljava/util/List;)V

    .line 48
    move-object/from16 v0, v20

    invoke-virtual {v0, v15}, Lcom/roidapp/photogrid/release/ih;->f(Ljava/util/List;)V

    .line 49
    move-object/from16 v0, v20

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->h(Ljava/util/List;)V

    .line 50
    move-object/from16 v0, v20

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->i(Ljava/util/List;)V

    .line 51
    move-object/from16 v0, v20

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->k(Ljava/util/List;)V

    .line 53
    if-eqz v6, :cond_0

    .line 54
    const/16 v2, 0xf

    .line 57
    :cond_0
    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 58
    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->p(I)V

    .line 59
    move-object/from16 v0, v20

    invoke-virtual {v0, v7}, Lcom/roidapp/photogrid/release/ih;->d(F)V

    .line 60
    move-object/from16 v0, v20

    invoke-virtual {v0, v8}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 61
    move-object/from16 v0, v20

    invoke-virtual {v0, v9}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    .line 62
    move-object/from16 v0, v20

    invoke-virtual {v0, v10}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 63
    move-object/from16 v0, v20

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->g(Ljava/util/List;)V

    .line 64
    const/4 v2, 0x0

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->l(Z)V

    .line 65
    move-object/from16 v0, v20

    invoke-virtual {v0, v6}, Lcom/roidapp/photogrid/release/ih;->h(Z)V

    .line 67
    const/4 v2, 0x4

    sput v2, Lcom/roidapp/photogrid/common/az;->q:I

    .line 68
    const/4 v2, 0x1

    sput-boolean v2, Lcom/roidapp/photogrid/common/az;->x:Z

    .line 69
    return-void
.end method
