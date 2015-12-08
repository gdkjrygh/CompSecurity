.class public Lb/a/dr;
.super Lb/a/ft;


# static fields
.field public static final a:Ljava/util/Map;

.field private static final d:Lb/a/gs;

.field private static final e:Lb/a/gk;

.field private static final f:Lb/a/gk;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/16 v7, 0xb

    const/16 v6, 0xa

    const/4 v5, 0x3

    new-instance v0, Lb/a/gs;

    const-string v1, "PropertyValue"

    invoke-direct {v0, v1}, Lb/a/gs;-><init>(Ljava/lang/String;)V

    sput-object v0, Lb/a/dr;->d:Lb/a/gs;

    new-instance v0, Lb/a/gk;

    const-string v1, "string_value"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v7, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/dr;->e:Lb/a/gk;

    new-instance v0, Lb/a/gk;

    const-string v1, "long_value"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v6, v2}, Lb/a/gk;-><init>(Ljava/lang/String;BS)V

    sput-object v0, Lb/a/dr;->f:Lb/a/gk;

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lb/a/dt;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sget-object v1, Lb/a/dt;->a:Lb/a/dt;

    new-instance v2, Lb/a/fz;

    const-string v3, "string_value"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v7}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v5, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lb/a/dt;->b:Lb/a/dt;

    new-instance v2, Lb/a/fz;

    const-string v3, "long_value"

    new-instance v4, Lb/a/ga;

    invoke-direct {v4, v6}, Lb/a/ga;-><init>(B)V

    invoke-direct {v2, v3, v5, v4}, Lb/a/fz;-><init>(Ljava/lang/String;BLb/a/ga;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lb/a/dr;->a:Ljava/util/Map;

    const-class v0, Lb/a/dr;

    sget-object v1, Lb/a/dr;->a:Ljava/util/Map;

    invoke-static {v0, v1}, Lb/a/fz;->a(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/a/ft;-><init>()V

    return-void
.end method


# virtual methods
.method protected final synthetic a(S)Lb/a/fr;
    .locals 1

    invoke-static {p1}, Lb/a/dt;->b(I)Lb/a/dt;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic a(Lb/a/fr;)Lb/a/gk;
    .locals 3

    check-cast p1, Lb/a/dt;

    sget-object v0, Lb/a/ds;->a:[I

    invoke-virtual {p1}, Lb/a/dt;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown field id "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object v0, Lb/a/dr;->e:Lb/a/gk;

    :goto_0
    return-object v0

    :pswitch_1
    sget-object v0, Lb/a/dr;->f:Lb/a/gk;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected final a()Lb/a/gs;
    .locals 1

    sget-object v0, Lb/a/dr;->d:Lb/a/gs;

    return-object v0
.end method

.method protected final a(Lb/a/gn;Lb/a/gk;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    iget-short v1, p2, Lb/a/gk;->c:S

    invoke-static {v1}, Lb/a/dt;->a(I)Lb/a/dt;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v2, Lb/a/ds;->a:[I

    invoke-virtual {v1}, Lb/a/dt;->ordinal()I

    move-result v1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "setField wasn\'t null, but didn\'t match any of the case statements!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-byte v1, p2, Lb/a/gk;->b:B

    sget-object v2, Lb/a/dr;->e:Lb/a/gk;

    iget-byte v2, v2, Lb/a/gk;->b:B

    if-ne v1, v2, :cond_1

    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    iget-byte v1, p2, Lb/a/gk;->b:B

    invoke-static {p1, v1}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_1
    iget-byte v1, p2, Lb/a/gk;->b:B

    sget-object v2, Lb/a/dr;->f:Lb/a/gk;

    iget-byte v2, v2, Lb/a/gk;->b:B

    if-ne v1, v2, :cond_2

    invoke-virtual {p1}, Lb/a/gn;->n()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_2
    iget-byte v1, p2, Lb/a/gk;->b:B

    invoke-static {p1, v1}, Lb/a/gq;->a(Lb/a/gn;B)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected final a(Lb/a/gn;S)Ljava/lang/Object;
    .locals 3

    invoke-static {p2}, Lb/a/dt;->a(I)Lb/a/dt;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lb/a/ds;->a:[I

    invoke-virtual {v0}, Lb/a/dt;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "setField wasn\'t null, but didn\'t match any of the case statements!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-virtual {p1}, Lb/a/gn;->p()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_1
    invoke-virtual {p1}, Lb/a/gn;->n()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Lb/a/go;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Couldn\'t find a field with field id "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lb/a/go;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final a(J)V
    .locals 1

    sget-object v0, Lb/a/dt;->b:Lb/a/dt;

    iput-object v0, p0, Lb/a/dr;->c:Lb/a/fr;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lb/a/dr;->b:Ljava/lang/Object;

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    :cond_0
    sget-object v0, Lb/a/dt;->a:Lb/a/dt;

    iput-object v0, p0, Lb/a/dr;->c:Lb/a/fr;

    iput-object p1, p0, Lb/a/dr;->b:Ljava/lang/Object;

    return-void
.end method

.method protected final c(Lb/a/gn;)V
    .locals 3

    sget-object v1, Lb/a/ds;->a:[I

    iget-object v0, p0, Lb/a/dr;->c:Lb/a/fr;

    check-cast v0, Lb/a/dt;

    invoke-virtual {v0}, Lb/a/dt;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot write union with unknown field "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lb/a/dr;->c:Lb/a/fr;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lb/a/dr;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :goto_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lb/a/dr;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lb/a/gn;->a(J)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected final d(Lb/a/gn;)V
    .locals 3

    sget-object v1, Lb/a/ds;->a:[I

    iget-object v0, p0, Lb/a/dr;->c:Lb/a/fr;

    check-cast v0, Lb/a/dt;

    invoke-virtual {v0}, Lb/a/dt;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot write union with unknown field "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lb/a/dr;->c:Lb/a/fr;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lb/a/dr;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Lb/a/gn;->a(Ljava/lang/String;)V

    :goto_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lb/a/dr;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lb/a/gn;->a(J)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    instance-of v1, p1, Lb/a/dr;

    if-eqz v1, :cond_0

    check-cast p1, Lb/a/dr;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lb/a/dr;->b()Lb/a/fr;

    move-result-object v1

    invoke-virtual {p1}, Lb/a/dr;->b()Lb/a/fr;

    move-result-object v2

    if-ne v1, v2, :cond_0

    invoke-virtual {p0}, Lb/a/dr;->c()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1}, Lb/a/dr;->c()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
