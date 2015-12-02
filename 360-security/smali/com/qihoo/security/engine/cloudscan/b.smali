.class public Lcom/qihoo/security/engine/cloudscan/b;
.super Ljava/lang/Object;


# direct methods
.method public static a(Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;)Lcom/qihoo/security/engine/cloudscan/a/a;
    .locals 2

    invoke-static {}, Lcom/qihoo/security/engine/cloudscan/a/a;->a()Lcom/qihoo/security/engine/cloudscan/a/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/engine/cloudscan/a/a$a;->a(Ljava/lang/String;)Lcom/qihoo/security/engine/cloudscan/a/a$a;

    iget v1, p0, Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;->version:I

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;->version:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/engine/cloudscan/a/a$a;->a(I)Lcom/qihoo/security/engine/cloudscan/a/a$a;

    :cond_0
    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/a$a;->a()Lcom/qihoo/security/engine/cloudscan/a/a;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/qihoo/security/engine/FileInfo;Z)Lcom/qihoo/security/engine/cloudscan/a/g;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/qihoo/security/engine/cloudscan/a/g;->a()Lcom/qihoo/security/engine/cloudscan/a/g$a;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/qihoo/security/engine/cloudscan/a/g$a;->a(Ljava/lang/String;)Lcom/qihoo/security/engine/cloudscan/a/g$a;

    iget-wide v2, p0, Lcom/qihoo/security/engine/FileInfo;->queryFlags:J

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/engine/cloudscan/a/g$a;->b(J)Lcom/qihoo/security/engine/cloudscan/a/g$a;

    if-eqz p1, :cond_1

    invoke-virtual {v1}, Lcom/qihoo/security/engine/cloudscan/a/g$a;->a()Lcom/qihoo/security/engine/cloudscan/a/g;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget v2, p0, Lcom/qihoo/security/engine/FileInfo;->fileType:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_4

    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    invoke-static {v0}, Lcom/qihoo/security/engine/cloudscan/b;->a(Lcom/qihoo/security/engine/ApkInfo;)Lcom/qihoo/security/engine/cloudscan/a/k;

    move-result-object v0

    :cond_2
    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v1, v0}, Lcom/qihoo/security/engine/cloudscan/a/g$a;->a(Lcom/qihoo/security/engine/cloudscan/a/k;)Lcom/qihoo/security/engine/cloudscan/a/g$a;

    :cond_3
    iget v0, p0, Lcom/qihoo/security/engine/FileInfo;->scanType:I

    invoke-virtual {v1, v0}, Lcom/qihoo/security/engine/cloudscan/a/g$a;->a(I)Lcom/qihoo/security/engine/cloudscan/a/g$a;

    invoke-virtual {v1}, Lcom/qihoo/security/engine/cloudscan/a/g$a;->a()Lcom/qihoo/security/engine/cloudscan/a/g;

    move-result-object v0

    goto :goto_0

    :cond_4
    iget v2, p0, Lcom/qihoo/security/engine/FileInfo;->fileType:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    invoke-static {v0}, Lcom/qihoo/security/engine/cloudscan/b;->a(Ljava/lang/String;)Lcom/qihoo/security/engine/cloudscan/a/k;

    move-result-object v0

    goto :goto_1
.end method

.method public static a(Lcom/qihoo/security/engine/ApkInfo;)Lcom/qihoo/security/engine/cloudscan/a/k;
    .locals 8

    const/4 v0, 0x0

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/qihoo/security/engine/cloudscan/a/k;->a()Lcom/qihoo/security/engine/cloudscan/a/k$a;

    move-result-object v1

    invoke-static {}, Lcom/qihoo/security/engine/cloudscan/a/b;->a()Lcom/qihoo/security/engine/cloudscan/a/b$a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/qihoo/security/engine/cloudscan/a/b$a;->a(I)Lcom/qihoo/security/engine/cloudscan/a/b$a;

    move-result-object v3

    const-string/jumbo v4, "apk"

    invoke-virtual {v3, v4}, Lcom/qihoo/security/engine/cloudscan/a/b$a;->b(Ljava/lang/String;)Lcom/qihoo/security/engine/cloudscan/a/b$a;

    move-result-object v3

    iget v4, p0, Lcom/qihoo/security/engine/ApkInfo;->versionCode:I

    invoke-virtual {v3, v4}, Lcom/qihoo/security/engine/cloudscan/a/b$a;->b(I)Lcom/qihoo/security/engine/cloudscan/a/b$a;

    move-result-object v3

    iget-object v4, p0, Lcom/qihoo/security/engine/ApkInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/qihoo/security/engine/cloudscan/a/b$a;->a(Ljava/lang/String;)Lcom/qihoo/security/engine/cloudscan/a/b$a;

    move-result-object v3

    iget-object v4, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/qihoo/security/engine/cloudscan/a/b$a;->c(Ljava/lang/String;)Lcom/qihoo/security/engine/cloudscan/a/b$a;

    move-result-object v3

    invoke-virtual {p0}, Lcom/qihoo/security/engine/ApkInfo;->getFileSize()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/qihoo/security/engine/cloudscan/a/b$a;->a(J)Lcom/qihoo/security/engine/cloudscan/a/b$a;

    move-result-object v3

    iget v4, p0, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    invoke-virtual {v3, v4}, Lcom/qihoo/security/engine/cloudscan/a/b$a;->d(I)Lcom/qihoo/security/engine/cloudscan/a/b$a;

    iget-object v3, p0, Lcom/qihoo/security/engine/ApkInfo;->upExts:Ljava/lang/String;

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/qihoo/security/engine/ApkInfo;->upExts:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/qihoo/security/engine/cloudscan/a/b$a;->g(Ljava/lang/String;)Lcom/qihoo/security/engine/cloudscan/a/b$a;

    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/engine/ApkInfo;->getSigHash()[B

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lcom/qihoo/security/engine/ApkInfo;->getSigHash()[B

    move-result-object v3

    invoke-static {v3}, Lnet/jarlehansen/protobuf/javame/b;->a([B)Lnet/jarlehansen/protobuf/javame/b;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/qihoo/security/engine/cloudscan/a/b$a;->c(Lnet/jarlehansen/protobuf/javame/b;)Lcom/qihoo/security/engine/cloudscan/a/b$a;

    :cond_2
    iget-wide v4, p0, Lcom/qihoo/security/engine/ApkInfo;->hipsAction:J

    const-wide/16 v6, 0x0

    cmp-long v3, v4, v6

    if-eqz v3, :cond_3

    iget-wide v4, p0, Lcom/qihoo/security/engine/ApkInfo;->hipsAction:J

    invoke-static {v4, v5}, Lcom/qihoo/security/engine/cloudscan/b;->a(J)Lnet/jarlehansen/protobuf/javame/b;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/qihoo/security/engine/cloudscan/a/b$a;->f(Lnet/jarlehansen/protobuf/javame/b;)Lcom/qihoo/security/engine/cloudscan/a/b$a;

    :cond_3
    iget-object v3, p0, Lcom/qihoo/security/engine/ApkInfo;->adPlugins:[Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;

    if-eqz v3, :cond_4

    :goto_1
    iget-object v3, p0, Lcom/qihoo/security/engine/ApkInfo;->adPlugins:[Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;

    array-length v3, v3

    if-lt v0, v3, :cond_5

    :cond_4
    invoke-virtual {v2}, Lcom/qihoo/security/engine/cloudscan/a/b$a;->a()Lcom/qihoo/security/engine/cloudscan/a/b;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/engine/cloudscan/a/k$a;->a(Lcom/qihoo/security/engine/cloudscan/a/b;)Lcom/qihoo/security/engine/cloudscan/a/k$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/k$a;->a()Lcom/qihoo/security/engine/cloudscan/a/k;

    move-result-object v0

    goto :goto_0

    :cond_5
    iget-object v3, p0, Lcom/qihoo/security/engine/ApkInfo;->adPlugins:[Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;

    aget-object v3, v3, v0

    invoke-static {v3}, Lcom/qihoo/security/engine/cloudscan/b;->a(Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;)Lcom/qihoo/security/engine/cloudscan/a/a;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/qihoo/security/engine/cloudscan/a/b$a;->a(Lcom/qihoo/security/engine/cloudscan/a/a;)Lcom/qihoo/security/engine/cloudscan/a/b$a;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public static a(Ljava/lang/String;)Lcom/qihoo/security/engine/cloudscan/a/k;
    .locals 4

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/qihoo/security/engine/cloudscan/a/k;->a()Lcom/qihoo/security/engine/cloudscan/a/k$a;

    move-result-object v0

    invoke-static {}, Lcom/qihoo/security/engine/cloudscan/a/b;->a()Lcom/qihoo/security/engine/cloudscan/a/b$a;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/qihoo/security/engine/cloudscan/a/b$a;->a(I)Lcom/qihoo/security/engine/cloudscan/a/b$a;

    move-result-object v2

    const-string/jumbo v3, "elf"

    invoke-virtual {v2, v3}, Lcom/qihoo/security/engine/cloudscan/a/b$a;->b(Ljava/lang/String;)Lcom/qihoo/security/engine/cloudscan/a/b$a;

    move-result-object v2

    invoke-virtual {v2, p0}, Lcom/qihoo/security/engine/cloudscan/a/b$a;->c(Ljava/lang/String;)Lcom/qihoo/security/engine/cloudscan/a/b$a;

    invoke-virtual {v1}, Lcom/qihoo/security/engine/cloudscan/a/b$a;->a()Lcom/qihoo/security/engine/cloudscan/a/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/engine/cloudscan/a/k$a;->a(Lcom/qihoo/security/engine/cloudscan/a/b;)Lcom/qihoo/security/engine/cloudscan/a/k$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/k$a;->a()Lcom/qihoo/security/engine/cloudscan/a/k;

    move-result-object v0

    goto :goto_0
.end method

.method static a(J)Lnet/jarlehansen/protobuf/javame/b;
    .locals 2

    const/16 v0, 0x8

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lnet/jarlehansen/protobuf/javame/b;->a([B)Lnet/jarlehansen/protobuf/javame/b;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/qihoo/security/engine/cloudscan/a/g;Lcom/qihoo/security/engine/FileInfo;)Z
    .locals 4

    const/4 v2, 0x0

    const/4 v1, -0x1

    if-nez p0, :cond_0

    :goto_0
    return v2

    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->d()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->c()I

    move-result v0

    :goto_1
    iput v0, p1, Lcom/qihoo/security/engine/FileInfo;->level:I

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->e()I

    move-result v1

    :cond_1
    iput v1, p1, Lcom/qihoo/security/engine/FileInfo;->exLevel:I

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->h()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->g()Ljava/lang/String;

    move-result-object v0

    :goto_2
    iput-object v0, p1, Lcom/qihoo/security/engine/FileInfo;->fileDescription:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->j()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->i()Ljava/lang/String;

    move-result-object v0

    :goto_3
    iput-object v0, p1, Lcom/qihoo/security/engine/FileInfo;->softDescription:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->l()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->k()Ljava/lang/String;

    move-result-object v0

    :goto_4
    iput-object v0, p1, Lcom/qihoo/security/engine/FileInfo;->trojanName:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->n()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->m()Ljava/lang/String;

    move-result-object v0

    :goto_5
    iput-object v0, p1, Lcom/qihoo/security/engine/FileInfo;->extInfo:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->p()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->o()Z

    move-result v0

    :goto_6
    iput-boolean v0, p1, Lcom/qihoo/security/engine/FileInfo;->shouldUpload:Z

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->r()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->q()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/qihoo/security/engine/FileInfo;->SetDeleteType(I)V

    :cond_2
    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->t()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->s()I

    move-result v0

    iput v0, p1, Lcom/qihoo/security/engine/FileInfo;->canReplace:I

    :cond_3
    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->M()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->L()Lcom/qihoo/security/engine/cloudscan/a/f;

    move-result-object v0

    iput-object v0, p1, Lcom/qihoo/security/engine/FileInfo;->extIniInfo:Lcom/qihoo/security/engine/cloudscan/a/f;

    :cond_4
    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->u()Ljava/util/Vector;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-lez v0, :cond_5

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->u()Ljava/util/Vector;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/engine/cloudscan/b;->a(Ljava/util/Vector;)[Lcom/qihoo/security/engine/HipsActionRevise;

    move-result-object v0

    iput-object v0, p1, Lcom/qihoo/security/engine/FileInfo;->hipsActionRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

    :cond_5
    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->x()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->w()Ljava/lang/String;

    move-result-object v0

    :goto_7
    iput-object v0, p1, Lcom/qihoo/security/engine/FileInfo;->hipsActionDescription:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->v()Ljava/util/Vector;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-lez v0, :cond_6

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->v()Ljava/util/Vector;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/engine/cloudscan/b;->a(Ljava/util/Vector;)[Lcom/qihoo/security/engine/HipsActionRevise;

    move-result-object v0

    iput-object v0, p1, Lcom/qihoo/security/engine/FileInfo;->hipsPrivilegeRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

    :cond_6
    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->z()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->y()Ljava/lang/String;

    move-result-object v0

    :goto_8
    iput-object v0, p1, Lcom/qihoo/security/engine/FileInfo;->hipsPrivilegeDescription:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->A()Ljava/util/Vector;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-lez v0, :cond_7

    iget-object v0, p1, Lcom/qihoo/security/engine/FileInfo;->adPluginInfo:Lcom/qihoo/security/engine/AdPluginInfo;

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->A()Ljava/util/Vector;

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo/security/engine/cloudscan/b;->b(Ljava/util/Vector;)[Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/engine/AdPluginInfo;->AdPlugins:[Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;

    :cond_7
    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->C()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->B()I

    move-result v0

    iput v0, p1, Lcom/qihoo/security/engine/FileInfo;->queryFrom:I

    :cond_8
    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->E()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->D()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/qihoo/security/engine/FileInfo;->softClass:Ljava/lang/String;

    :cond_9
    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->G()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->F()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/qihoo/security/engine/FileInfo;->behavior:J

    iget-object v0, p1, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    if-eqz v0, :cond_a

    iget-object v0, p1, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget-wide v2, p1, Lcom/qihoo/security/engine/FileInfo;->behavior:J

    long-to-int v1, v2

    iput v1, v0, Lcom/qihoo/security/engine/ApkInfo;->behavior:I

    :cond_a
    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->I()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->H()I

    move-result v0

    iput v0, p1, Lcom/qihoo/security/engine/FileInfo;->copyright:I

    :cond_b
    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->K()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p0}, Lcom/qihoo/security/engine/cloudscan/a/g;->J()I

    move-result v0

    iput v0, p1, Lcom/qihoo/security/engine/FileInfo;->whiteFlags:I

    :cond_c
    const/4 v2, 0x1

    goto/16 :goto_0

    :cond_d
    move v0, v1

    goto/16 :goto_1

    :cond_e
    const-string/jumbo v0, ""

    goto/16 :goto_2

    :cond_f
    const-string/jumbo v0, ""

    goto/16 :goto_3

    :cond_10
    const-string/jumbo v0, ""

    goto/16 :goto_4

    :cond_11
    const-string/jumbo v0, ""

    goto/16 :goto_5

    :cond_12
    move v0, v2

    goto/16 :goto_6

    :cond_13
    const-string/jumbo v0, ""

    goto/16 :goto_7

    :cond_14
    const-string/jumbo v0, ""

    goto/16 :goto_8
.end method

.method public static a([Lcom/qihoo/security/engine/cloudscan/QueryItem;[[B)Z
    .locals 4

    const/4 v0, 0x0

    array-length v1, p0

    array-length v2, p1

    if-eq v1, v2, :cond_1

    const-string/jumbo v1, "SerializeUtil"

    const-string/jumbo v2, "bad params! array size not equal"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    return v0

    :cond_1
    move v1, v0

    :goto_1
    :try_start_0
    array-length v2, p0

    if-lt v1, v2, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    aget-object v2, p0, v1

    aget-object v3, p1, v1

    if-eqz v3, :cond_0

    aget-object v3, p1, v1

    invoke-static {v3}, Lcom/qihoo/security/engine/cloudscan/a/h;->a([B)Lcom/qihoo/security/engine/cloudscan/a/h;

    move-result-object v3

    invoke-virtual {v3}, Lcom/qihoo/security/engine/cloudscan/a/h;->c()Lcom/qihoo/security/engine/cloudscan/a/g;

    move-result-object v3

    iget-object v2, v2, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    invoke-static {v3, v2}, Lcom/qihoo/security/engine/cloudscan/b;->a(Lcom/qihoo/security/engine/cloudscan/a/g;Lcom/qihoo/security/engine/FileInfo;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static a(Ljava/util/Vector;)[Lcom/qihoo/security/engine/HipsActionRevise;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Vector",
            "<",
            "Lcom/qihoo/security/engine/cloudscan/a/d;",
            ">;)[",
            "Lcom/qihoo/security/engine/HipsActionRevise;"
        }
    .end annotation

    const/4 v2, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/util/Vector;->size()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-object v2

    :cond_1
    invoke-virtual {p0}, Ljava/util/Vector;->size()I

    move-result v0

    new-array v3, v0, [Lcom/qihoo/security/engine/HipsActionRevise;

    const/4 v0, 0x0

    move v1, v0

    :goto_1
    invoke-virtual {p0}, Ljava/util/Vector;->size()I

    move-result v0

    if-lt v1, v0, :cond_2

    move-object v2, v3

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/cloudscan/a/d;

    if-nez v0, :cond_3

    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_3
    new-instance v4, Lcom/qihoo/security/engine/HipsActionRevise;

    invoke-direct {v4}, Lcom/qihoo/security/engine/HipsActionRevise;-><init>()V

    aput-object v4, v3, v1

    aget-object v4, v3, v1

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/d;->d()I

    move-result v5

    iput v5, v4, Lcom/qihoo/security/engine/HipsActionRevise;->level:I

    aget-object v4, v3, v1

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/d;->c()I

    move-result v5

    iput v5, v4, Lcom/qihoo/security/engine/HipsActionRevise;->value:I

    aget-object v4, v3, v1

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/d;->f()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/d;->e()Ljava/lang/String;

    move-result-object v0

    :goto_3
    iput-object v0, v4, Lcom/qihoo/security/engine/HipsActionRevise;->description:Ljava/lang/String;

    goto :goto_2

    :cond_4
    move-object v0, v2

    goto :goto_3
.end method

.method public static a([Lcom/qihoo/security/engine/cloudscan/QueryItem;Z)[[B
    .locals 8

    const/4 v1, 0x0

    if-nez p0, :cond_0

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    array-length v0, p0

    new-array v2, v0, [[B

    const/4 v0, 0x0

    :goto_1
    array-length v3, p0

    if-lt v0, v3, :cond_1

    move-object v0, v2

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/qihoo/security/engine/cloudscan/a/h;->a()Lcom/qihoo/security/engine/cloudscan/a/h$a;

    move-result-object v3

    aget-object v4, p0, v0

    iget v5, v4, Lcom/qihoo/security/engine/cloudscan/QueryItem;->b:I

    invoke-virtual {v3, v5}, Lcom/qihoo/security/engine/cloudscan/a/h$a;->a(I)Lcom/qihoo/security/engine/cloudscan/a/h$a;

    move-result-object v3

    iget-wide v6, v4, Lcom/qihoo/security/engine/cloudscan/QueryItem;->c:J

    invoke-virtual {v3, v6, v7}, Lcom/qihoo/security/engine/cloudscan/a/h$a;->a(J)Lcom/qihoo/security/engine/cloudscan/a/h$a;

    move-result-object v3

    iget-object v4, v4, Lcom/qihoo/security/engine/cloudscan/QueryItem;->a:Lcom/qihoo/security/engine/FileInfo;

    invoke-static {v4, p1}, Lcom/qihoo/security/engine/cloudscan/b;->a(Lcom/qihoo/security/engine/FileInfo;Z)Lcom/qihoo/security/engine/cloudscan/a/g;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/qihoo/security/engine/cloudscan/a/h$a;->a(Lcom/qihoo/security/engine/cloudscan/a/g;)Lcom/qihoo/security/engine/cloudscan/a/h$a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/qihoo/security/engine/cloudscan/a/h$a;->a()Lcom/qihoo/security/engine/cloudscan/a/h;

    move-result-object v3

    :try_start_0
    invoke-virtual {v3}, Lcom/qihoo/security/engine/cloudscan/a/h;->N()[B

    move-result-object v3

    aput-object v3, v2, v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0
.end method

.method public static b(Ljava/util/Vector;)[Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Vector",
            "<",
            "Lcom/qihoo/security/engine/cloudscan/a/e;",
            ">;)[",
            "Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;"
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v4, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/util/Vector;->size()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-object v4

    :cond_1
    invoke-virtual {p0}, Ljava/util/Vector;->size()I

    move-result v0

    new-array v5, v0, [Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;

    move v1, v2

    :goto_1
    array-length v0, v5

    if-lt v1, v0, :cond_2

    move-object v4, v5

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/cloudscan/a/e;

    if-nez v0, :cond_3

    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_3
    new-instance v3, Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;

    invoke-direct {v3}, Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;-><init>()V

    aput-object v3, v5, v1

    aget-object v6, v5, v1

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/e;->d()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/e;->c()Ljava/lang/String;

    move-result-object v3

    :goto_3
    iput-object v3, v6, Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;->name:Ljava/lang/String;

    aget-object v6, v5, v1

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/e;->h()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/e;->g()I

    move-result v3

    :goto_4
    iput v3, v6, Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;->level:I

    aget-object v6, v5, v1

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/e;->f()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/e;->e()I

    move-result v3

    :goto_5
    iput v3, v6, Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;->version:I

    aget-object v6, v5, v1

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/e;->j()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/e;->i()Ljava/lang/String;

    move-result-object v3

    :goto_6
    iput-object v3, v6, Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;->description:Ljava/lang/String;

    aget-object v6, v5, v1

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/e;->l()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/e;->k()Ljava/lang/String;

    move-result-object v3

    :goto_7
    iput-object v3, v6, Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;->viewClassName:Ljava/lang/String;

    aget-object v6, v5, v1

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/e;->n()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/e;->m()Ljava/lang/String;

    move-result-object v3

    :goto_8
    iput-object v3, v6, Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;->hostNameList:Ljava/lang/String;

    aget-object v6, v5, v1

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/e;->p()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/e;->o()I

    move-result v3

    :goto_9
    iput v3, v6, Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;->type:I

    aget-object v3, v5, v1

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/e;->r()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/e;->q()I

    move-result v0

    :goto_a
    iput v0, v3, Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;->suggestOption:I

    goto :goto_2

    :cond_4
    move-object v3, v4

    goto :goto_3

    :cond_5
    const/4 v3, -0x1

    goto :goto_4

    :cond_6
    move v3, v2

    goto :goto_5

    :cond_7
    move-object v3, v4

    goto :goto_6

    :cond_8
    move-object v3, v4

    goto :goto_7

    :cond_9
    move-object v3, v4

    goto :goto_8

    :cond_a
    move v3, v2

    goto :goto_9

    :cond_b
    move v0, v2

    goto :goto_a
.end method
