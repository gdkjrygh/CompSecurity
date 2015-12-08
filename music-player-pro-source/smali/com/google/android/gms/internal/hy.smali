.class public Lcom/google/android/gms/internal/hy;
.super Ljava/lang/Object;


# direct methods
.method private static a(Ljava/lang/String;Lcom/google/android/gms/internal/mv$c;)Lcom/google/android/gms/internal/hh;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/hp$a;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/hp$a;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/hp$a;->G(Z)Lcom/google/android/gms/internal/hp$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/hp$a;->au(Ljava/lang/String;)Lcom/google/android/gms/internal/hp$a;

    move-result-object v0

    const-string v1, "blob"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/hp$a;->at(Ljava/lang/String;)Lcom/google/android/gms/internal/hp$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hp$a;->fG()Lcom/google/android/gms/internal/hp;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/hh;

    invoke-static {p1}, Lcom/google/android/gms/internal/qw;->f(Lcom/google/android/gms/internal/qw;)[B

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/hh;-><init>([BLcom/google/android/gms/internal/hp;)V

    return-object v1
.end method

.method public static a(Lcom/google/android/gms/appindexing/Action;Ljava/lang/String;JLjava/lang/String;I)Lcom/google/android/gms/internal/hr;
    .locals 8

    const/4 v5, 0x0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/appindexing/Action;->fI()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    const-string v1, "object"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    const-string v0, "id"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "id"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    :goto_0
    const-string v2, "name"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "type"

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "url"

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-static {p4, v1}, Lcom/google/android/gms/internal/hz;->a(Ljava/lang/String;Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v1

    invoke-static {v1, v2, v0, v3, v5}, Lcom/google/android/gms/internal/hr;->a(Landroid/content/Intent;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/util/List;)Lcom/google/android/gms/internal/hd$a;

    move-result-object v2

    const-string v0, ".private:action"

    invoke-virtual {p0}, Lcom/google/android/gms/appindexing/Action;->fI()Landroid/os/Bundle;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/hy;->d(Landroid/os/Bundle;)Lcom/google/android/gms/internal/mv$c;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/hy;->a(Ljava/lang/String;Lcom/google/android/gms/internal/mv$c;)Lcom/google/android/gms/internal/hh;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/hd$a;->a(Lcom/google/android/gms/internal/hh;)Lcom/google/android/gms/internal/hd$a;

    invoke-static {p1}, Lcom/google/android/gms/internal/hy;->aw(Ljava/lang/String;)Lcom/google/android/gms/internal/hh;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/hd$a;->a(Lcom/google/android/gms/internal/hh;)Lcom/google/android/gms/internal/hd$a;

    invoke-static {p4, v1}, Lcom/google/android/gms/internal/hr;->a(Ljava/lang/String;Landroid/content/Intent;)Lcom/google/android/gms/internal/hf;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/internal/hr;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/hd$a;->fD()Lcom/google/android/gms/internal/hd;

    move-result-object v6

    move-wide v2, p2

    move v4, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/hr;-><init>(Lcom/google/android/gms/internal/hf;JILjava/lang/String;Lcom/google/android/gms/internal/hd;)V

    return-object v0

    :cond_0
    move-object v0, v5

    goto :goto_0
.end method

.method private static aw(Ljava/lang/String;)Lcom/google/android/gms/internal/hh;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/hp$a;

    const-string v1, ".private:actionId"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/hp$a;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/hp$a;->G(Z)Lcom/google/android/gms/internal/hp$a;

    move-result-object v0

    const-string v1, ".private:actionId"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/hp$a;->au(Ljava/lang/String;)Lcom/google/android/gms/internal/hp$a;

    move-result-object v0

    const-string v1, "blob"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/hp$a;->at(Ljava/lang/String;)Lcom/google/android/gms/internal/hp$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hp$a;->fG()Lcom/google/android/gms/internal/hp;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/hh;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/hh;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/hp;)V

    return-object v1
.end method

.method static d(Landroid/os/Bundle;)Lcom/google/android/gms/internal/mv$c;
    .locals 8

    new-instance v2, Lcom/google/android/gms/internal/mv$c;

    invoke-direct {v2}, Lcom/google/android/gms/internal/mv$c;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    new-instance v5, Lcom/google/android/gms/internal/mv$b;

    invoke-direct {v5}, Lcom/google/android/gms/internal/mv$b;-><init>()V

    iput-object v0, v5, Lcom/google/android/gms/internal/mv$b;->name:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/mv$d;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mv$d;-><init>()V

    iput-object v0, v5, Lcom/google/android/gms/internal/mv$b;->afz:Lcom/google/android/gms/internal/mv$d;

    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v6, v5, Lcom/google/android/gms/internal/mv$b;->afz:Lcom/google/android/gms/internal/mv$d;

    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    iput-object v0, v6, Lcom/google/android/gms/internal/mv$d;->NJ:Ljava/lang/String;

    :goto_1
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v0, v1, Landroid/os/Bundle;

    if-eqz v0, :cond_1

    iget-object v0, v5, Lcom/google/android/gms/internal/mv$b;->afz:Lcom/google/android/gms/internal/mv$d;

    check-cast v1, Landroid/os/Bundle;

    invoke-static {v1}, Lcom/google/android/gms/internal/hy;->d(Landroid/os/Bundle;)Lcom/google/android/gms/internal/mv$c;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/mv$d;->afE:Lcom/google/android/gms/internal/mv$c;

    goto :goto_1

    :cond_1
    const-string v0, "AppDataSearchClient"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Unsupported value: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_2
    const-string v0, "type"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "type"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/google/android/gms/internal/mv$c;->type:Ljava/lang/String;

    :cond_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/google/android/gms/internal/mv$b;

    invoke-interface {v3, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/mv$b;

    iput-object v0, v2, Lcom/google/android/gms/internal/mv$c;->afA:[Lcom/google/android/gms/internal/mv$b;

    return-object v2
.end method
