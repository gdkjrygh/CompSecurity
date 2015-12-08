.class final Lcom/google/android/gms/tagmanager/ao;
.super Ljava/lang/Object;


# static fields
.field private static final a:Lcom/google/android/gms/tagmanager/ad;


# instance fields
.field private final b:Lcom/google/android/gms/tagmanager/p;

.field private final c:Ljava/util/Map;

.field private final d:Ljava/util/Map;

.field private final e:Ljava/util/Map;

.field private final f:Lcom/google/android/gms/tagmanager/bb;

.field private final g:Lcom/google/android/gms/tagmanager/bb;

.field private final h:Ljava/util/Set;

.field private final i:Lcom/google/android/gms/tagmanager/b;

.field private final j:Ljava/util/Map;

.field private volatile k:Ljava/lang/String;

.field private l:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/tagmanager/ad;

    invoke-static {}, Lcom/google/android/gms/tagmanager/ay;->a()Lcom/google/android/gms/internal/ej;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/tagmanager/ad;-><init>(Ljava/lang/Object;Z)V

    sput-object v0, Lcom/google/android/gms/tagmanager/ao;->a:Lcom/google/android/gms/tagmanager/ad;

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/ej;Ljava/util/Set;Lcom/google/android/gms/tagmanager/az;)Lcom/google/android/gms/tagmanager/ad;
    .locals 6

    const/4 v2, 0x0

    iget-boolean v0, p1, Lcom/google/android/gms/internal/ej;->l:Z

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/tagmanager/ad;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/tagmanager/ad;-><init>(Ljava/lang/Object;Z)V

    :goto_0
    return-object v0

    :cond_0
    iget v0, p1, Lcom/google/android/gms/internal/ej;->a:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unknown type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p1, Lcom/google/android/gms/internal/ej;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/t;->a(Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/tagmanager/ao;->a:Lcom/google/android/gms/tagmanager/ad;

    goto :goto_0

    :pswitch_1
    invoke-static {p1}, Lcom/google/android/gms/tagmanager/ak;->a(Lcom/google/android/gms/internal/ej;)Lcom/google/android/gms/internal/ej;

    move-result-object v3

    iget-object v0, p1, Lcom/google/android/gms/internal/ej;->c:[Lcom/google/android/gms/internal/ej;

    array-length v0, v0

    new-array v0, v0, [Lcom/google/android/gms/internal/ej;

    iput-object v0, v3, Lcom/google/android/gms/internal/ej;->c:[Lcom/google/android/gms/internal/ej;

    move v1, v2

    :goto_1
    iget-object v0, p1, Lcom/google/android/gms/internal/ej;->c:[Lcom/google/android/gms/internal/ej;

    array-length v0, v0

    if-ge v1, v0, :cond_2

    iget-object v0, p1, Lcom/google/android/gms/internal/ej;->c:[Lcom/google/android/gms/internal/ej;

    aget-object v0, v0, v1

    invoke-interface {p3}, Lcom/google/android/gms/tagmanager/az;->a()Lcom/google/android/gms/tagmanager/az;

    move-result-object v4

    invoke-direct {p0, v0, p2, v4}, Lcom/google/android/gms/tagmanager/ao;->a(Lcom/google/android/gms/internal/ej;Ljava/util/Set;Lcom/google/android/gms/tagmanager/az;)Lcom/google/android/gms/tagmanager/ad;

    move-result-object v0

    sget-object v4, Lcom/google/android/gms/tagmanager/ao;->a:Lcom/google/android/gms/tagmanager/ad;

    if-ne v0, v4, :cond_1

    sget-object v0, Lcom/google/android/gms/tagmanager/ao;->a:Lcom/google/android/gms/tagmanager/ad;

    goto :goto_0

    :cond_1
    iget-object v4, v3, Lcom/google/android/gms/internal/ej;->c:[Lcom/google/android/gms/internal/ej;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ej;

    aput-object v0, v4, v1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_2
    new-instance v0, Lcom/google/android/gms/tagmanager/ad;

    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/tagmanager/ad;-><init>(Ljava/lang/Object;Z)V

    goto :goto_0

    :pswitch_2
    invoke-static {p1}, Lcom/google/android/gms/tagmanager/ak;->a(Lcom/google/android/gms/internal/ej;)Lcom/google/android/gms/internal/ej;

    move-result-object v3

    iget-object v0, p1, Lcom/google/android/gms/internal/ej;->d:[Lcom/google/android/gms/internal/ej;

    array-length v0, v0

    iget-object v1, p1, Lcom/google/android/gms/internal/ej;->e:[Lcom/google/android/gms/internal/ej;

    array-length v1, v1

    if-eq v0, v1, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid serving value: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ej;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/t;->a(Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/tagmanager/ao;->a:Lcom/google/android/gms/tagmanager/ad;

    goto :goto_0

    :cond_3
    iget-object v0, p1, Lcom/google/android/gms/internal/ej;->d:[Lcom/google/android/gms/internal/ej;

    array-length v0, v0

    new-array v0, v0, [Lcom/google/android/gms/internal/ej;

    iput-object v0, v3, Lcom/google/android/gms/internal/ej;->d:[Lcom/google/android/gms/internal/ej;

    iget-object v0, p1, Lcom/google/android/gms/internal/ej;->d:[Lcom/google/android/gms/internal/ej;

    array-length v0, v0

    new-array v0, v0, [Lcom/google/android/gms/internal/ej;

    iput-object v0, v3, Lcom/google/android/gms/internal/ej;->e:[Lcom/google/android/gms/internal/ej;

    move v1, v2

    :goto_2
    iget-object v0, p1, Lcom/google/android/gms/internal/ej;->d:[Lcom/google/android/gms/internal/ej;

    array-length v0, v0

    if-ge v1, v0, :cond_6

    iget-object v0, p1, Lcom/google/android/gms/internal/ej;->d:[Lcom/google/android/gms/internal/ej;

    aget-object v0, v0, v1

    invoke-interface {p3}, Lcom/google/android/gms/tagmanager/az;->b()Lcom/google/android/gms/tagmanager/az;

    move-result-object v4

    invoke-direct {p0, v0, p2, v4}, Lcom/google/android/gms/tagmanager/ao;->a(Lcom/google/android/gms/internal/ej;Ljava/util/Set;Lcom/google/android/gms/tagmanager/az;)Lcom/google/android/gms/tagmanager/ad;

    move-result-object v0

    iget-object v4, p1, Lcom/google/android/gms/internal/ej;->e:[Lcom/google/android/gms/internal/ej;

    aget-object v4, v4, v1

    invoke-interface {p3}, Lcom/google/android/gms/tagmanager/az;->c()Lcom/google/android/gms/tagmanager/az;

    move-result-object v5

    invoke-direct {p0, v4, p2, v5}, Lcom/google/android/gms/tagmanager/ao;->a(Lcom/google/android/gms/internal/ej;Ljava/util/Set;Lcom/google/android/gms/tagmanager/az;)Lcom/google/android/gms/tagmanager/ad;

    move-result-object v4

    sget-object v5, Lcom/google/android/gms/tagmanager/ao;->a:Lcom/google/android/gms/tagmanager/ad;

    if-eq v0, v5, :cond_4

    sget-object v5, Lcom/google/android/gms/tagmanager/ao;->a:Lcom/google/android/gms/tagmanager/ad;

    if-ne v4, v5, :cond_5

    :cond_4
    sget-object v0, Lcom/google/android/gms/tagmanager/ao;->a:Lcom/google/android/gms/tagmanager/ad;

    goto/16 :goto_0

    :cond_5
    iget-object v5, v3, Lcom/google/android/gms/internal/ej;->d:[Lcom/google/android/gms/internal/ej;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ej;

    aput-object v0, v5, v1

    iget-object v5, v3, Lcom/google/android/gms/internal/ej;->e:[Lcom/google/android/gms/internal/ej;

    invoke-virtual {v4}, Lcom/google/android/gms/tagmanager/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ej;

    aput-object v0, v5, v1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :cond_6
    new-instance v0, Lcom/google/android/gms/tagmanager/ad;

    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/tagmanager/ad;-><init>(Ljava/lang/Object;Z)V

    goto/16 :goto_0

    :pswitch_3
    iget-object v0, p1, Lcom/google/android/gms/internal/ej;->f:Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Macro cycle detected.  Current macro reference: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p1, Lcom/google/android/gms/internal/ej;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".  Previous macro references: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/t;->a(Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/tagmanager/ao;->a:Lcom/google/android/gms/tagmanager/ad;

    goto/16 :goto_0

    :cond_7
    iget-object v0, p1, Lcom/google/android/gms/internal/ej;->f:Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p1, Lcom/google/android/gms/internal/ej;->f:Ljava/lang/String;

    invoke-interface {p3}, Lcom/google/android/gms/tagmanager/az;->e()Lcom/google/android/gms/tagmanager/v;

    move-result-object v1

    invoke-direct {p0, v0, p2, v1}, Lcom/google/android/gms/tagmanager/ao;->a(Ljava/lang/String;Ljava/util/Set;Lcom/google/android/gms/tagmanager/v;)Lcom/google/android/gms/tagmanager/ad;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/internal/ej;->k:[I

    invoke-static {v0, v1}, Lcom/google/android/gms/tagmanager/ba;->a(Lcom/google/android/gms/tagmanager/ad;[I)Lcom/google/android/gms/tagmanager/ad;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/internal/ej;->f:Ljava/lang/String;

    invoke-interface {p2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :pswitch_4
    invoke-static {p1}, Lcom/google/android/gms/tagmanager/ak;->a(Lcom/google/android/gms/internal/ej;)Lcom/google/android/gms/internal/ej;

    move-result-object v3

    iget-object v0, p1, Lcom/google/android/gms/internal/ej;->j:[Lcom/google/android/gms/internal/ej;

    array-length v0, v0

    new-array v0, v0, [Lcom/google/android/gms/internal/ej;

    iput-object v0, v3, Lcom/google/android/gms/internal/ej;->j:[Lcom/google/android/gms/internal/ej;

    move v1, v2

    :goto_3
    iget-object v0, p1, Lcom/google/android/gms/internal/ej;->j:[Lcom/google/android/gms/internal/ej;

    array-length v0, v0

    if-ge v1, v0, :cond_9

    iget-object v0, p1, Lcom/google/android/gms/internal/ej;->j:[Lcom/google/android/gms/internal/ej;

    aget-object v0, v0, v1

    invoke-interface {p3}, Lcom/google/android/gms/tagmanager/az;->d()Lcom/google/android/gms/tagmanager/az;

    move-result-object v4

    invoke-direct {p0, v0, p2, v4}, Lcom/google/android/gms/tagmanager/ao;->a(Lcom/google/android/gms/internal/ej;Ljava/util/Set;Lcom/google/android/gms/tagmanager/az;)Lcom/google/android/gms/tagmanager/ad;

    move-result-object v0

    sget-object v4, Lcom/google/android/gms/tagmanager/ao;->a:Lcom/google/android/gms/tagmanager/ad;

    if-ne v0, v4, :cond_8

    sget-object v0, Lcom/google/android/gms/tagmanager/ao;->a:Lcom/google/android/gms/tagmanager/ad;

    goto/16 :goto_0

    :cond_8
    iget-object v4, v3, Lcom/google/android/gms/internal/ej;->j:[Lcom/google/android/gms/internal/ej;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ej;

    aput-object v0, v4, v1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    :cond_9
    new-instance v0, Lcom/google/android/gms/tagmanager/ad;

    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/tagmanager/ad;-><init>(Ljava/lang/Object;Z)V

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method private a(Lcom/google/android/gms/tagmanager/al;Ljava/util/Set;Lcom/google/android/gms/tagmanager/ag;)Lcom/google/android/gms/tagmanager/ad;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/ao;->d:Ljava/util/Map;

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/google/android/gms/tagmanager/ao;->a(Ljava/util/Map;Lcom/google/android/gms/tagmanager/al;Ljava/util/Set;Lcom/google/android/gms/tagmanager/ag;)Lcom/google/android/gms/tagmanager/ad;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ej;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/ay;->b(Lcom/google/android/gms/internal/ej;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/ay;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ej;

    new-instance v2, Lcom/google/android/gms/tagmanager/ad;

    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/ad;->b()Z

    move-result v1

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/tagmanager/ad;-><init>(Ljava/lang/Object;Z)V

    return-object v2
.end method

.method private a(Lcom/google/android/gms/tagmanager/am;Ljava/util/Set;Lcom/google/android/gms/tagmanager/aj;)Lcom/google/android/gms/tagmanager/ad;
    .locals 6

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/am;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v2

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tagmanager/al;

    invoke-interface {p3}, Lcom/google/android/gms/tagmanager/aj;->a()Lcom/google/android/gms/tagmanager/ag;

    move-result-object v5

    invoke-direct {p0, v0, p2, v5}, Lcom/google/android/gms/tagmanager/ao;->a(Lcom/google/android/gms/tagmanager/al;Ljava/util/Set;Lcom/google/android/gms/tagmanager/ag;)Lcom/google/android/gms/tagmanager/ad;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/tagmanager/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/ay;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ej;

    new-instance v0, Lcom/google/android/gms/tagmanager/ad;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v5}, Lcom/google/android/gms/tagmanager/ad;->b()Z

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/tagmanager/ad;-><init>(Ljava/lang/Object;Z)V

    :goto_1
    return-object v0

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v5}, Lcom/google/android/gms/tagmanager/ad;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    :goto_2
    move v1, v0

    goto :goto_0

    :cond_1
    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/am;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tagmanager/al;

    invoke-interface {p3}, Lcom/google/android/gms/tagmanager/aj;->b()Lcom/google/android/gms/tagmanager/ag;

    move-result-object v5

    invoke-direct {p0, v0, p2, v5}, Lcom/google/android/gms/tagmanager/ao;->a(Lcom/google/android/gms/tagmanager/al;Ljava/util/Set;Lcom/google/android/gms/tagmanager/ag;)Lcom/google/android/gms/tagmanager/ad;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/tagmanager/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/ay;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ej;

    new-instance v0, Lcom/google/android/gms/tagmanager/ad;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v5}, Lcom/google/android/gms/tagmanager/ad;->b()Z

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/tagmanager/ad;-><init>(Ljava/lang/Object;Z)V

    goto :goto_1

    :cond_3
    if-eqz v1, :cond_4

    invoke-virtual {v5}, Lcom/google/android/gms/tagmanager/ad;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    move v1, v2

    goto :goto_3

    :cond_4
    move v1, v3

    goto :goto_3

    :cond_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/ay;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ej;

    new-instance v0, Lcom/google/android/gms/tagmanager/ad;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/tagmanager/ad;-><init>(Ljava/lang/Object;Z)V

    goto :goto_1
.end method

.method private a(Ljava/lang/String;Ljava/util/Set;Lcom/google/android/gms/tagmanager/v;)Lcom/google/android/gms/tagmanager/ad;
    .locals 10

    const/4 v9, 0x1

    iget v0, p0, Lcom/google/android/gms/tagmanager/ao;->l:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/tagmanager/ao;->l:I

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/ao;->g:Lcom/google/android/gms/tagmanager/bb;

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/bb;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tagmanager/as;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/ao;->b:Lcom/google/android/gms/tagmanager/p;

    invoke-interface {v1}, Lcom/google/android/gms/tagmanager/p;->b()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/as;->b()Lcom/google/android/gms/internal/ej;

    move-result-object v1

    invoke-direct {p0, v1, p2}, Lcom/google/android/gms/tagmanager/ao;->a(Lcom/google/android/gms/internal/ej;Ljava/util/Set;)V

    iget v1, p0, Lcom/google/android/gms/tagmanager/ao;->l:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/google/android/gms/tagmanager/ao;->l:I

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/as;->a()Lcom/google/android/gms/tagmanager/ad;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/ao;->j:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/google/android/gms/tagmanager/at;

    if-nez v8, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/ao;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Invalid macro: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/t;->a(Ljava/lang/String;)V

    iget v0, p0, Lcom/google/android/gms/tagmanager/ao;->l:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/gms/tagmanager/ao;->l:I

    sget-object v0, Lcom/google/android/gms/tagmanager/ao;->a:Lcom/google/android/gms/tagmanager/ad;

    goto :goto_0

    :cond_1
    invoke-virtual {v8}, Lcom/google/android/gms/tagmanager/at;->a()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v8}, Lcom/google/android/gms/tagmanager/at;->b()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v8}, Lcom/google/android/gms/tagmanager/at;->c()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v8}, Lcom/google/android/gms/tagmanager/at;->e()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v8}, Lcom/google/android/gms/tagmanager/at;->d()Ljava/util/Map;

    move-result-object v5

    invoke-interface {p3}, Lcom/google/android/gms/tagmanager/v;->b()Lcom/google/android/gms/tagmanager/an;

    move-result-object v7

    move-object v0, p0

    move-object v6, p2

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/tagmanager/ao;->a(Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Lcom/google/android/gms/tagmanager/an;)Lcom/google/android/gms/tagmanager/ad;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v8}, Lcom/google/android/gms/tagmanager/at;->f()Lcom/google/android/gms/tagmanager/al;

    move-result-object v0

    move-object v2, v0

    :goto_1
    if-nez v2, :cond_4

    iget v0, p0, Lcom/google/android/gms/tagmanager/ao;->l:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/gms/tagmanager/ao;->l:I

    sget-object v0, Lcom/google/android/gms/tagmanager/ao;->a:Lcom/google/android/gms/tagmanager/ad;

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-le v0, v9, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/ao;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "Multiple macros active for macroName "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/t;->b(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tagmanager/al;

    move-object v2, v0

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/ao;->e:Ljava/util/Map;

    invoke-interface {p3}, Lcom/google/android/gms/tagmanager/v;->a()Lcom/google/android/gms/tagmanager/ag;

    move-result-object v3

    invoke-direct {p0, v0, v2, p2, v3}, Lcom/google/android/gms/tagmanager/ao;->a(Ljava/util/Map;Lcom/google/android/gms/tagmanager/al;Ljava/util/Set;Lcom/google/android/gms/tagmanager/ag;)Lcom/google/android/gms/tagmanager/ad;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/ad;->b()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v3}, Lcom/google/android/gms/tagmanager/ad;->b()Z

    move-result v0

    if-eqz v0, :cond_6

    move v0, v9

    :goto_2
    sget-object v1, Lcom/google/android/gms/tagmanager/ao;->a:Lcom/google/android/gms/tagmanager/ad;

    if-ne v3, v1, :cond_7

    sget-object v0, Lcom/google/android/gms/tagmanager/ao;->a:Lcom/google/android/gms/tagmanager/ad;

    :goto_3
    invoke-virtual {v2}, Lcom/google/android/gms/tagmanager/al;->b()Lcom/google/android/gms/internal/ej;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/ad;->b()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/ao;->g:Lcom/google/android/gms/tagmanager/bb;

    new-instance v2, Lcom/google/android/gms/tagmanager/as;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/tagmanager/as;-><init>(Lcom/google/android/gms/tagmanager/ad;Lcom/google/android/gms/internal/ej;)V

    :cond_5
    invoke-direct {p0, v1, p2}, Lcom/google/android/gms/tagmanager/ao;->a(Lcom/google/android/gms/internal/ej;Ljava/util/Set;)V

    iget v1, p0, Lcom/google/android/gms/tagmanager/ao;->l:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/google/android/gms/tagmanager/ao;->l:I

    goto/16 :goto_0

    :cond_6
    const/4 v0, 0x0

    goto :goto_2

    :cond_7
    new-instance v1, Lcom/google/android/gms/tagmanager/ad;

    invoke-virtual {v3}, Lcom/google/android/gms/tagmanager/ad;->a()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v1, v3, v0}, Lcom/google/android/gms/tagmanager/ad;-><init>(Ljava/lang/Object;Z)V

    move-object v0, v1

    goto :goto_3
.end method

.method private a(Ljava/util/Map;Lcom/google/android/gms/tagmanager/al;Ljava/util/Set;Lcom/google/android/gms/tagmanager/ag;)Lcom/google/android/gms/tagmanager/ad;
    .locals 11

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-virtual {p2}, Lcom/google/android/gms/tagmanager/al;->a()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/as;->aC:Lcom/google/android/gms/internal/as;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/as;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ej;

    if-nez v0, :cond_1

    const-string v0, "No function id in properties"

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/t;->a(Ljava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/tagmanager/ao;->a:Lcom/google/android/gms/tagmanager/ad;

    :cond_0
    :goto_0
    return-object v1

    :cond_1
    iget-object v7, v0, Lcom/google/android/gms/internal/ej;->g:Ljava/lang/String;

    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tagmanager/q;

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " has no backing implementation."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/t;->a(Ljava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/tagmanager/ao;->a:Lcom/google/android/gms/tagmanager/ad;

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/tagmanager/ao;->f:Lcom/google/android/gms/tagmanager/bb;

    invoke-interface {v1}, Lcom/google/android/gms/tagmanager/bb;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/tagmanager/ad;

    if-eqz v1, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/ao;->b:Lcom/google/android/gms/tagmanager/p;

    invoke-interface {v2}, Lcom/google/android/gms/tagmanager/p;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_3
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p2}, Lcom/google/android/gms/tagmanager/al;->a()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v4, v5

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    invoke-interface {p4}, Lcom/google/android/gms/tagmanager/ag;->a()Lcom/google/android/gms/tagmanager/ai;

    move-result-object v3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ej;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    invoke-interface {v3}, Lcom/google/android/gms/tagmanager/ai;->a()Lcom/google/android/gms/tagmanager/az;

    move-result-object v3

    invoke-direct {p0, v2, p3, v3}, Lcom/google/android/gms/tagmanager/ao;->a(Lcom/google/android/gms/internal/ej;Ljava/util/Set;Lcom/google/android/gms/tagmanager/az;)Lcom/google/android/gms/tagmanager/ad;

    move-result-object v10

    sget-object v2, Lcom/google/android/gms/tagmanager/ao;->a:Lcom/google/android/gms/tagmanager/ad;

    if-ne v10, v2, :cond_4

    sget-object v1, Lcom/google/android/gms/tagmanager/ao;->a:Lcom/google/android/gms/tagmanager/ad;

    goto :goto_0

    :cond_4
    invoke-virtual {v10}, Lcom/google/android/gms/tagmanager/ad;->b()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v10}, Lcom/google/android/gms/tagmanager/ad;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ej;

    invoke-virtual {p2, v2, v3}, Lcom/google/android/gms/tagmanager/al;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ej;)V

    move v2, v4

    :goto_2
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v10}, Lcom/google/android/gms/tagmanager/ad;->a()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v8, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v4, v2

    goto :goto_1

    :cond_5
    move v2, v6

    goto :goto_2

    :cond_6
    invoke-interface {v8}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tagmanager/q;->a(Ljava/util/Set;)Z

    move-result v1

    if-nez v1, :cond_7

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Incorrect keys for function "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " required "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/q;->c()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " had "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v8}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/t;->a(Ljava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/tagmanager/ao;->a:Lcom/google/android/gms/tagmanager/ad;

    goto/16 :goto_0

    :cond_7
    if-eqz v4, :cond_9

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/q;->a()Z

    move-result v1

    if-eqz v1, :cond_9

    :goto_3
    new-instance v1, Lcom/google/android/gms/tagmanager/ad;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/q;->b()Lcom/google/android/gms/internal/ej;

    move-result-object v0

    invoke-direct {v1, v0, v5}, Lcom/google/android/gms/tagmanager/ad;-><init>(Ljava/lang/Object;Z)V

    if-eqz v5, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/ao;->f:Lcom/google/android/gms/tagmanager/bb;

    :cond_8
    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/ad;->a()Ljava/lang/Object;

    goto/16 :goto_0

    :cond_9
    move v5, v6

    goto :goto_3
.end method

.method private a(Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Lcom/google/android/gms/tagmanager/an;)Lcom/google/android/gms/tagmanager/ad;
    .locals 6

    new-instance v0, Lcom/google/android/gms/tagmanager/ap;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/tagmanager/ap;-><init>(Lcom/google/android/gms/tagmanager/ao;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    invoke-direct {p0, p1, p6, v0, p7}, Lcom/google/android/gms/tagmanager/ao;->a(Ljava/util/Set;Ljava/util/Set;Lcom/google/android/gms/tagmanager/ar;Lcom/google/android/gms/tagmanager/an;)Lcom/google/android/gms/tagmanager/ad;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/util/Set;Ljava/util/Set;Lcom/google/android/gms/tagmanager/ar;Lcom/google/android/gms/tagmanager/an;)Lcom/google/android/gms/tagmanager/ad;
    .locals 9

    const/4 v3, 0x1

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v2, v3

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tagmanager/am;

    invoke-interface {p4}, Lcom/google/android/gms/tagmanager/an;->a()Lcom/google/android/gms/tagmanager/aj;

    move-result-object v7

    invoke-direct {p0, v0, p2, v7}, Lcom/google/android/gms/tagmanager/ao;->a(Lcom/google/android/gms/tagmanager/am;Ljava/util/Set;Lcom/google/android/gms/tagmanager/aj;)Lcom/google/android/gms/tagmanager/ad;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/tagmanager/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p3, v0, v4, v5, v7}, Lcom/google/android/gms/tagmanager/ar;->a(Lcom/google/android/gms/tagmanager/am;Ljava/util/Set;Ljava/util/Set;Lcom/google/android/gms/tagmanager/aj;)V

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v8}, Lcom/google/android/gms/tagmanager/ad;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v3

    :goto_1
    move v2, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    invoke-interface {v4, v5}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    new-instance v0, Lcom/google/android/gms/tagmanager/ad;

    invoke-direct {v0, v4, v2}, Lcom/google/android/gms/tagmanager/ad;-><init>(Ljava/lang/Object;Z)V

    return-object v0
.end method

.method private a()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lcom/google/android/gms/tagmanager/ao;->l:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v0, p0, Lcom/google/android/gms/tagmanager/ao;->l:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x2

    :goto_1
    iget v2, p0, Lcom/google/android/gms/tagmanager/ao;->l:I

    if-ge v0, v2, :cond_1

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    const-string v0, ": "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/internal/ej;Ljava/util/Set;)V
    .locals 3

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/tagmanager/ac;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/ac;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/tagmanager/ao;->a(Lcom/google/android/gms/internal/ej;Ljava/util/Set;Lcom/google/android/gms/tagmanager/az;)Lcom/google/android/gms/tagmanager/ad;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/tagmanager/ao;->a:Lcom/google/android/gms/tagmanager/ad;

    if-eq v0, v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ej;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/ay;->c(Lcom/google/android/gms/internal/ej;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/util/Map;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/util/Map;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/ao;->i:Lcom/google/android/gms/tagmanager/b;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/tagmanager/b;->a(Ljava/util/Map;)V

    goto :goto_0

    :cond_2
    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_4

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/util/Map;

    if-eqz v2, :cond_3

    check-cast v0, Ljava/util/Map;

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/ao;->i:Lcom/google/android/gms/tagmanager/b;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/tagmanager/b;->a(Ljava/util/Map;)V

    goto :goto_1

    :cond_3
    const-string v0, "pushAfterEvaluate: value not a Map"

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/t;->b(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    const-string v0, "pushAfterEvaluate: value not a Map or List"

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/t;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private declared-synchronized b(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/tagmanager/ao;->k:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final declared-synchronized a(Ljava/lang/String;)V
    .locals 6

    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/google/android/gms/tagmanager/ao;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/ao;->b:Lcom/google/android/gms/tagmanager/p;

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/p;->a()Lcom/google/android/gms/tagmanager/o;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/o;->a()Lcom/google/android/gms/tagmanager/bf;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/ao;->h:Ljava/util/Set;

    invoke-interface {v1}, Lcom/google/android/gms/tagmanager/bf;->b()Lcom/google/android/gms/tagmanager/an;

    move-result-object v2

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    new-instance v4, Lcom/google/android/gms/tagmanager/aq;

    invoke-direct {v4, p0}, Lcom/google/android/gms/tagmanager/aq;-><init>(Lcom/google/android/gms/tagmanager/ao;)V

    invoke-direct {p0, v0, v3, v4, v2}, Lcom/google/android/gms/tagmanager/ao;->a(Ljava/util/Set;Ljava/util/Set;Lcom/google/android/gms/tagmanager/ar;Lcom/google/android/gms/tagmanager/an;)Lcom/google/android/gms/tagmanager/ad;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tagmanager/al;

    iget-object v3, p0, Lcom/google/android/gms/tagmanager/ao;->c:Ljava/util/Map;

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v1}, Lcom/google/android/gms/tagmanager/bf;->a()Lcom/google/android/gms/tagmanager/ag;

    move-result-object v5

    invoke-direct {p0, v3, v0, v4, v5}, Lcom/google/android/gms/tagmanager/ao;->a(Ljava/util/Map;Lcom/google/android/gms/tagmanager/al;Ljava/util/Set;Lcom/google/android/gms/tagmanager/ag;)Lcom/google/android/gms/tagmanager/ad;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    invoke-direct {p0, v0}, Lcom/google/android/gms/tagmanager/ao;->b(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void
.end method
