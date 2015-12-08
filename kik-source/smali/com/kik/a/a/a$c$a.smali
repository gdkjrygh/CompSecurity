.class public final Lcom/kik/a/a/a$c$a;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/kik/a/a/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/a/a/a$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/kik/o/c;

.field private b:Lcom/c/b/bp;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 1131
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 1223
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/a/a/a$c$a;->a:Lcom/kik/o/c;

    .line 1132
    invoke-static {}, Lcom/kik/a/a/a$c;->l()Z

    .line 1133
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 1114
    invoke-direct {p0}, Lcom/kik/a/a/a$c$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 1137
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 1223
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/a/a/a$c$a;->a:Lcom/kik/o/c;

    .line 1138
    invoke-static {}, Lcom/kik/a/a/a$c;->l()Z

    .line 1139
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 1114
    invoke-direct {p0, p1}, Lcom/kik/a/a/a$c$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/kik/a/a/a$c$a;
    .locals 1

    .prologue
    .line 1184
    instance-of v0, p1, Lcom/kik/a/a/a$c;

    if-eqz v0, :cond_0

    .line 1185
    check-cast p1, Lcom/kik/a/a/a$c;

    invoke-virtual {p0, p1}, Lcom/kik/a/a/a$c$a;->a(Lcom/kik/a/a/a$c;)Lcom/kik/a/a/a$c$a;

    move-result-object p0

    .line 1188
    :goto_0
    return-object p0

    .line 1187
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/a/a/a$c$a;
    .locals 4

    .prologue
    .line 1209
    const/4 v2, 0x0

    .line 1211
    :try_start_0
    sget-object v0, Lcom/kik/a/a/a$c;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/a/a/a$c;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1216
    if-eqz v0, :cond_0

    .line 1217
    invoke-virtual {p0, v0}, Lcom/kik/a/a/a$c$a;->a(Lcom/kik/a/a/a$c;)Lcom/kik/a/a/a$c$a;

    .line 1220
    :cond_0
    return-object p0

    .line 1212
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 1213
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/kik/a/a/a$c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1214
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1216
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 1217
    invoke-virtual {p0, v1}, Lcom/kik/a/a/a$c$a;->a(Lcom/kik/a/a/a$c;)Lcom/kik/a/a/a$c$a;

    :cond_1
    throw v0

    .line 1216
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_0
.end method

.method private s()Lcom/kik/a/a/a$c;
    .locals 2

    .prologue
    .line 1173
    new-instance v1, Lcom/kik/a/a/a$c;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/kik/a/a/a$c;-><init>(Lcom/c/b/as$a;B)V

    .line 1174
    iget-object v0, p0, Lcom/kik/a/a/a$c$a;->b:Lcom/c/b/bp;

    if-nez v0, :cond_0

    .line 1175
    iget-object v0, p0, Lcom/kik/a/a/a$c$a;->a:Lcom/kik/o/c;

    invoke-static {v1, v0}, Lcom/kik/a/a/a$c;->a(Lcom/kik/a/a/a$c;Lcom/kik/o/c;)Lcom/kik/o/c;

    .line 1179
    :goto_0
    invoke-virtual {p0}, Lcom/kik/a/a/a$c$a;->l()V

    .line 1180
    return-object v1

    .line 1177
    :cond_0
    iget-object v0, p0, Lcom/kik/a/a/a$c$a;->b:Lcom/c/b/bp;

    invoke-virtual {v0}, Lcom/c/b/bp;->c()Lcom/c/b/as;

    move-result-object v0

    check-cast v0, Lcom/kik/o/c;

    invoke-static {v1, v0}, Lcom/kik/a/a/a$c;->a(Lcom/kik/a/a/a$c;Lcom/kik/o/c;)Lcom/kik/o/c;

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 1114
    invoke-direct {p0, p1}, Lcom/kik/a/a/a$c$a;->d(Lcom/c/b/bd;)Lcom/kik/a/a/a$c$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a(Lcom/c/b/by;)Lcom/c/b/a$a;
    .locals 0

    .prologue
    .line 1114
    return-object p0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 1114
    invoke-direct {p0, p1, p2}, Lcom/kik/a/a/a$c$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/a/a/a$c$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/kik/a/a/a$c;)Lcom/kik/a/a/a$c$a;
    .locals 2

    .prologue
    .line 1193
    invoke-static {}, Lcom/kik/a/a/a$c;->k()Lcom/kik/a/a/a$c;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 1198
    :goto_0
    return-object p0

    .line 1194
    :cond_0
    invoke-virtual {p1}, Lcom/kik/a/a/a$c;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1195
    invoke-virtual {p1}, Lcom/kik/a/a/a$c;->i()Lcom/kik/o/c;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/a/a/a$c$a;->b:Lcom/c/b/bp;

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/kik/a/a/a$c$a;->a:Lcom/kik/o/c;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/kik/a/a/a$c$a;->a:Lcom/kik/o/c;

    invoke-static {v1}, Lcom/kik/o/c;->a(Lcom/kik/o/c;)Lcom/kik/o/c$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/kik/o/c$a;->a(Lcom/kik/o/c;)Lcom/kik/o/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/o/c$a;->s()Lcom/kik/o/c;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/a/a/a$c$a;->a:Lcom/kik/o/c;

    :goto_1
    invoke-virtual {p0}, Lcom/kik/a/a/a$c$a;->q()V

    .line 1197
    :cond_1
    :goto_2
    invoke-virtual {p0}, Lcom/kik/a/a/a$c$a;->q()V

    goto :goto_0

    .line 1195
    :cond_2
    iput-object v0, p0, Lcom/kik/a/a/a$c$a;->a:Lcom/kik/o/c;

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lcom/kik/a/a/a$c$a;->b:Lcom/c/b/bp;

    invoke-virtual {v1, v0}, Lcom/c/b/bp;->b(Lcom/c/b/as;)Lcom/c/b/bp;

    goto :goto_2
.end method

.method public final a(Lcom/kik/o/c;)Lcom/kik/a/a/a$c$a;
    .locals 1

    .prologue
    .line 1261
    iget-object v0, p0, Lcom/kik/a/a/a$c$a;->b:Lcom/c/b/bp;

    if-nez v0, :cond_1

    .line 1262
    if-nez p1, :cond_0

    .line 1263
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 1265
    :cond_0
    iput-object p1, p0, Lcom/kik/a/a/a$c$a;->a:Lcom/kik/o/c;

    .line 1266
    invoke-virtual {p0}, Lcom/kik/a/a/a$c$a;->q()V

    .line 1271
    :goto_0
    return-object p0

    .line 1268
    :cond_1
    iget-object v0, p0, Lcom/kik/a/a/a$c$a;->b:Lcom/c/b/bp;

    invoke-virtual {v0, p1}, Lcom/c/b/bp;->a(Lcom/c/b/as;)Lcom/c/b/bp;

    goto :goto_0
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 1202
    const/4 v0, 0x1

    return v0
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 1114
    invoke-direct {p0, p1, p2}, Lcom/kik/a/a/a$c$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/a/a/a$c$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic b(Lcom/c/b/by;)Lcom/c/b/bd$a;
    .locals 0

    .prologue
    .line 1114
    return-object p0
.end method

.method public final bridge synthetic c(Lcom/c/b/by;)Lcom/c/b/as$a;
    .locals 0

    .prologue
    .line 1114
    return-object p0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 1114
    invoke-direct {p0, p1}, Lcom/kik/a/a/a$c$a;->d(Lcom/c/b/bd;)Lcom/kik/a/a/a$c$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 1114
    invoke-direct {p0, p1, p2}, Lcom/kik/a/a/a$c$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/a/a/a$c$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic d(Lcom/c/b/by;)Lcom/c/b/as$a;
    .locals 0

    .prologue
    .line 1114
    return-object p0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 1125
    invoke-static {}, Lcom/kik/a/a/a;->d()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/kik/a/a/a$c;

    const-class v2, Lcom/kik/a/a/a$c$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 1157
    invoke-static {}, Lcom/kik/a/a/a;->c()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 1114
    invoke-direct {p0}, Lcom/kik/a/a/a$c$a;->s()Lcom/kik/a/a/a$c;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 1114
    invoke-virtual {p0}, Lcom/kik/a/a/a$c$a;->r()Lcom/kik/a/a/a$c;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 1114
    invoke-virtual {p0}, Lcom/kik/a/a/a$c$a;->r()Lcom/kik/a/a/a$c;

    move-result-object v0

    return-object v0
.end method

.method public final r()Lcom/kik/a/a/a$c;
    .locals 2

    .prologue
    .line 1165
    invoke-direct {p0}, Lcom/kik/a/a/a$c$a;->s()Lcom/kik/a/a/a$c;

    move-result-object v0

    .line 1166
    invoke-virtual {v0}, Lcom/kik/a/a/a$c;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1167
    invoke-static {v0}, Lcom/kik/a/a/a$c$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 1169
    :cond_0
    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 1114
    invoke-static {}, Lcom/kik/a/a/a$c;->k()Lcom/kik/a/a/a$c;

    move-result-object v0

    return-object v0
.end method
