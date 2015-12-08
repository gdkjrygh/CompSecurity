.class public final Lcom/c/b/ak$f;
.super Lcom/c/b/ak$h;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/ar$a;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/ak;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/ak$f$a;,
        Lcom/c/b/ak$f$b;
    }
.end annotation


# static fields
.field private static final a:[Lcom/c/b/cd$a;


# instance fields
.field private final b:I

.field private c:Lcom/c/b/i$k;

.field private final d:Ljava/lang/String;

.field private final e:Lcom/c/b/ak$g;

.field private final f:Lcom/c/b/ak$a;

.field private g:Lcom/c/b/ak$f$b;

.field private h:Lcom/c/b/ak$a;

.field private i:Lcom/c/b/ak$a;

.field private j:Lcom/c/b/ak$j;

.field private k:Lcom/c/b/ak$d;

.field private l:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 926
    invoke-static {}, Lcom/c/b/cd$a;->values()[Lcom/c/b/cd$a;

    move-result-object v0

    sput-object v0, Lcom/c/b/ak$f;->a:[Lcom/c/b/cd$a;

    .line 1120
    invoke-static {}, Lcom/c/b/ak$f$b;->values()[Lcom/c/b/ak$f$b;

    move-result-object v0

    array-length v0, v0

    invoke-static {}, Lcom/c/b/i$k$c;->values()[Lcom/c/b/i$k$c;

    move-result-object v1

    array-length v1, v1

    if-eq v0, v1, :cond_0

    .line 1121
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "descriptor.proto has a new declared type but Desrciptors.java wasn\'t updated."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1125
    :cond_0
    return-void
.end method

.method private constructor <init>(Lcom/c/b/i$k;Lcom/c/b/ak$g;Lcom/c/b/ak$a;IZ)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 1154
    invoke-direct {p0}, Lcom/c/b/ak$h;-><init>()V

    .line 1155
    iput p4, p0, Lcom/c/b/ak$f;->b:I

    .line 1156
    iput-object p1, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    .line 1157
    invoke-virtual {p1}, Lcom/c/b/i$k;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, p3, v0}, Lcom/c/b/ak;->a(Lcom/c/b/ak$g;Lcom/c/b/ak$a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$f;->d:Ljava/lang/String;

    .line 1158
    iput-object p2, p0, Lcom/c/b/ak$f;->e:Lcom/c/b/ak$g;

    .line 1160
    invoke-virtual {p1}, Lcom/c/b/i$k;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1161
    invoke-virtual {p1}, Lcom/c/b/i$k;->o()Lcom/c/b/i$k$c;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/ak$f$b;->a(Lcom/c/b/i$k$c;)Lcom/c/b/ak$f$b;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$f;->g:Lcom/c/b/ak$f$b;

    .line 1164
    :cond_0
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->k()I

    move-result v0

    if-gtz v0, :cond_1

    .line 1165
    new-instance v0, Lcom/c/b/ak$c;

    const-string v1, "Field numbers must be positive integers."

    invoke-direct {v0, p0, v1, v3}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    .line 1169
    :cond_1
    if-eqz p5, :cond_5

    .line 1170
    invoke-virtual {p1}, Lcom/c/b/i$k;->r()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1171
    new-instance v0, Lcom/c/b/ak$c;

    const-string v1, "FieldDescriptorProto.extendee not set for extension field."

    invoke-direct {v0, p0, v1, v3}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    .line 1174
    :cond_2
    iput-object v2, p0, Lcom/c/b/ak$f;->h:Lcom/c/b/ak$a;

    .line 1175
    if-eqz p3, :cond_3

    .line 1176
    iput-object p3, p0, Lcom/c/b/ak$f;->f:Lcom/c/b/ak$a;

    .line 1181
    :goto_0
    invoke-virtual {p1}, Lcom/c/b/i$k;->z()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1182
    new-instance v0, Lcom/c/b/ak$c;

    const-string v1, "FieldDescriptorProto.oneof_index set for extension field."

    invoke-direct {v0, p0, v1, v3}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    .line 1178
    :cond_3
    iput-object v2, p0, Lcom/c/b/ak$f;->f:Lcom/c/b/ak$a;

    goto :goto_0

    .line 1185
    :cond_4
    iput-object v2, p0, Lcom/c/b/ak$f;->j:Lcom/c/b/ak$j;

    .line 1208
    :goto_1
    invoke-static {p2}, Lcom/c/b/ak$g;->a(Lcom/c/b/ak$g;)Lcom/c/b/ak$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/c/b/ak$b;->a(Lcom/c/b/ak$h;)V

    .line 1209
    return-void

    .line 1187
    :cond_5
    invoke-virtual {p1}, Lcom/c/b/i$k;->r()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1188
    new-instance v0, Lcom/c/b/ak$c;

    const-string v1, "FieldDescriptorProto.extendee set for non-extension field."

    invoke-direct {v0, p0, v1, v3}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    .line 1191
    :cond_6
    iput-object p3, p0, Lcom/c/b/ak$f;->h:Lcom/c/b/ak$a;

    .line 1193
    invoke-virtual {p1}, Lcom/c/b/i$k;->z()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1194
    invoke-virtual {p1}, Lcom/c/b/i$k;->A()I

    move-result v0

    if-ltz v0, :cond_7

    invoke-virtual {p1}, Lcom/c/b/i$k;->A()I

    move-result v0

    invoke-virtual {p3}, Lcom/c/b/ak$a;->a()Lcom/c/b/i$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/c/b/i$a;->o()I

    move-result v1

    if-lt v0, v1, :cond_8

    .line 1196
    :cond_7
    new-instance v0, Lcom/c/b/ak$c;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "FieldDescriptorProto.oneof_index is out of range for type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Lcom/c/b/ak$a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1, v3}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    .line 1200
    :cond_8
    invoke-virtual {p3}, Lcom/c/b/ak$a;->g()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lcom/c/b/i$k;->A()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$j;

    iput-object v0, p0, Lcom/c/b/ak$f;->j:Lcom/c/b/ak$j;

    .line 1201
    iget-object v0, p0, Lcom/c/b/ak$f;->j:Lcom/c/b/ak$j;

    invoke-static {v0}, Lcom/c/b/ak$j;->c(Lcom/c/b/ak$j;)I

    .line 1205
    :goto_2
    iput-object v2, p0, Lcom/c/b/ak$f;->f:Lcom/c/b/ak$a;

    goto :goto_1

    .line 1203
    :cond_9
    iput-object v2, p0, Lcom/c/b/ak$f;->j:Lcom/c/b/ak$j;

    goto :goto_2
.end method

.method synthetic constructor <init>(Lcom/c/b/i$k;Lcom/c/b/ak$g;Lcom/c/b/ak$a;IZB)V
    .locals 0

    .prologue
    .line 866
    invoke-direct/range {p0 .. p5}, Lcom/c/b/ak$f;-><init>(Lcom/c/b/i$k;Lcom/c/b/ak$g;Lcom/c/b/ak$a;IZ)V

    return-void
.end method

.method static synthetic a(Lcom/c/b/ak$f;)V
    .locals 6

    .prologue
    const/16 v5, 0x22

    const/4 v4, 0x0

    .line 866
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->r()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/c/b/ak$f;->e:Lcom/c/b/ak$g;

    invoke-static {v0}, Lcom/c/b/ak$g;->a(Lcom/c/b/ak$g;)Lcom/c/b/ak$b;

    move-result-object v0

    iget-object v1, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v1}, Lcom/c/b/i$k;->s()Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/c/b/ak$b$c;->a:I

    invoke-virtual {v0, v1, p0, v2}, Lcom/c/b/ak$b;->a(Ljava/lang/String;Lcom/c/b/ak$h;I)Lcom/c/b/ak$h;

    move-result-object v0

    instance-of v1, v0, Lcom/c/b/ak$a;

    if-nez v1, :cond_0

    new-instance v0, Lcom/c/b/ak$c;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v2}, Lcom/c/b/i$k;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" is not a message type."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1, v4}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    :cond_0
    check-cast v0, Lcom/c/b/ak$a;

    iput-object v0, p0, Lcom/c/b/ak$f;->h:Lcom/c/b/ak$a;

    iget-object v0, p0, Lcom/c/b/ak$f;->h:Lcom/c/b/ak$a;

    iget-object v1, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v1}, Lcom/c/b/i$k;->k()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/c/b/ak$a;->a(I)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/c/b/ak$c;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/c/b/ak$f;->h:Lcom/c/b/ak$a;

    invoke-virtual {v2}, Lcom/c/b/ak$a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" does not declare "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v2}, Lcom/c/b/i$k;->k()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " as an extension number."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1, v4}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->p()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/c/b/ak$f;->e:Lcom/c/b/ak$g;

    invoke-static {v0}, Lcom/c/b/ak$g;->a(Lcom/c/b/ak$g;)Lcom/c/b/ak$b;

    move-result-object v0

    iget-object v1, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v1}, Lcom/c/b/i$k;->q()Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/c/b/ak$b$c;->a:I

    invoke-virtual {v0, v1, p0, v2}, Lcom/c/b/ak$b;->a(Ljava/lang/String;Lcom/c/b/ak$h;I)Lcom/c/b/ak$h;

    move-result-object v0

    iget-object v1, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v1}, Lcom/c/b/i$k;->n()Z

    move-result v1

    if-nez v1, :cond_2

    instance-of v1, v0, Lcom/c/b/ak$a;

    if-eqz v1, :cond_3

    sget-object v1, Lcom/c/b/ak$f$b;->k:Lcom/c/b/ak$f$b;

    iput-object v1, p0, Lcom/c/b/ak$f;->g:Lcom/c/b/ak$f$b;

    :cond_2
    :goto_0
    iget-object v1, p0, Lcom/c/b/ak$f;->g:Lcom/c/b/ak$f$b;

    invoke-virtual {v1}, Lcom/c/b/ak$f$b;->a()Lcom/c/b/ak$f$a;

    move-result-object v1

    sget-object v2, Lcom/c/b/ak$f$a;->i:Lcom/c/b/ak$f$a;

    if-ne v1, v2, :cond_6

    instance-of v1, v0, Lcom/c/b/ak$a;

    if-nez v1, :cond_5

    new-instance v0, Lcom/c/b/ak$c;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v2}, Lcom/c/b/i$k;->q()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" is not a message type."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1, v4}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    :cond_3
    instance-of v1, v0, Lcom/c/b/ak$d;

    if-eqz v1, :cond_4

    sget-object v1, Lcom/c/b/ak$f$b;->n:Lcom/c/b/ak$f$b;

    iput-object v1, p0, Lcom/c/b/ak$f;->g:Lcom/c/b/ak$f$b;

    goto :goto_0

    :cond_4
    new-instance v0, Lcom/c/b/ak$c;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v2}, Lcom/c/b/i$k;->q()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" is not a type."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1, v4}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    :cond_5
    check-cast v0, Lcom/c/b/ak$a;

    iput-object v0, p0, Lcom/c/b/ak$f;->i:Lcom/c/b/ak$a;

    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->x()Z

    move-result v0

    if-eqz v0, :cond_8

    new-instance v0, Lcom/c/b/ak$c;

    const-string v1, "Messages can\'t have default values."

    invoke-direct {v0, p0, v1, v4}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    :cond_6
    iget-object v1, p0, Lcom/c/b/ak$f;->g:Lcom/c/b/ak$f$b;

    invoke-virtual {v1}, Lcom/c/b/ak$f$b;->a()Lcom/c/b/ak$f$a;

    move-result-object v1

    sget-object v2, Lcom/c/b/ak$f$a;->h:Lcom/c/b/ak$f$a;

    if-ne v1, v2, :cond_9

    instance-of v1, v0, Lcom/c/b/ak$d;

    if-nez v1, :cond_7

    new-instance v0, Lcom/c/b/ak$c;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v2}, Lcom/c/b/i$k;->q()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" is not an enum type."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1, v4}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    :cond_7
    check-cast v0, Lcom/c/b/ak$d;

    iput-object v0, p0, Lcom/c/b/ak$f;->k:Lcom/c/b/ak$d;

    :cond_8
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->C()Lcom/c/b/i$m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$m;->k()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p0}, Lcom/c/b/ak$f;->q()Z

    move-result v0

    if-nez v0, :cond_c

    new-instance v0, Lcom/c/b/ak$c;

    const-string v1, "[packed = true] can only be specified for repeated primitive fields."

    invoke-direct {v0, p0, v1, v4}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    :cond_9
    new-instance v0, Lcom/c/b/ak$c;

    const-string v1, "Field with primitive type has type_name."

    invoke-direct {v0, p0, v1, v4}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    :cond_a
    iget-object v0, p0, Lcom/c/b/ak$f;->g:Lcom/c/b/ak$f$b;

    invoke-virtual {v0}, Lcom/c/b/ak$f$b;->a()Lcom/c/b/ak$f$a;

    move-result-object v0

    sget-object v1, Lcom/c/b/ak$f$a;->i:Lcom/c/b/ak$f$a;

    if-eq v0, v1, :cond_b

    iget-object v0, p0, Lcom/c/b/ak$f;->g:Lcom/c/b/ak$f$b;

    invoke-virtual {v0}, Lcom/c/b/ak$f$b;->a()Lcom/c/b/ak$f$a;

    move-result-object v0

    sget-object v1, Lcom/c/b/ak$f$a;->h:Lcom/c/b/ak$f$a;

    if-ne v0, v1, :cond_8

    :cond_b
    new-instance v0, Lcom/c/b/ak$c;

    const-string v1, "Field with message or enum type missing type_name."

    invoke-direct {v0, p0, v1, v4}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    :cond_c
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->x()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-virtual {p0}, Lcom/c/b/ak$f;->o()Z

    move-result v0

    if-eqz v0, :cond_d

    new-instance v0, Lcom/c/b/ak$c;

    const-string v1, "Repeated fields cannot have default values."

    invoke-direct {v0, p0, v1, v4}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    :cond_d
    :try_start_0
    sget-object v0, Lcom/c/b/ak$1;->a:[I

    iget-object v1, p0, Lcom/c/b/ak$f;->g:Lcom/c/b/ak$f$b;

    invoke-virtual {v1}, Lcom/c/b/ak$f$b;->ordinal()I

    move-result v1

    aget v0, v0, v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    packed-switch v0, :pswitch_data_0

    :cond_e
    :goto_1
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->r()Z

    move-result v0

    if-nez v0, :cond_f

    iget-object v0, p0, Lcom/c/b/ak$f;->e:Lcom/c/b/ak$g;

    invoke-static {v0}, Lcom/c/b/ak$g;->a(Lcom/c/b/ak$g;)Lcom/c/b/ak$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/c/b/ak$b;->a(Lcom/c/b/ak$f;)V

    :cond_f
    iget-object v0, p0, Lcom/c/b/ak$f;->h:Lcom/c/b/ak$a;

    if-eqz v0, :cond_1a

    iget-object v0, p0, Lcom/c/b/ak$f;->h:Lcom/c/b/ak$a;

    invoke-virtual {v0}, Lcom/c/b/ak$a;->e()Lcom/c/b/i$s;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$s;->i()Z

    move-result v0

    if-eqz v0, :cond_1a

    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->r()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-virtual {p0}, Lcom/c/b/ak$f;->n()Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p0, Lcom/c/b/ak$f;->g:Lcom/c/b/ak$f$b;

    sget-object v1, Lcom/c/b/ak$f$b;->k:Lcom/c/b/ak$f$b;

    if-eq v0, v1, :cond_1a

    :cond_10
    new-instance v0, Lcom/c/b/ak$c;

    const-string v1, "Extensions of MessageSets must be optional messages."

    invoke-direct {v0, p0, v1, v4}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    :pswitch_0
    :try_start_1
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->y()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/bu;->c(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$f;->l:Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    new-instance v1, Lcom/c/b/ak$c;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Could not parse default value: \""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v3}, Lcom/c/b/i$k;->y()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p0, v2, v0, v4}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;Ljava/lang/Throwable;B)V

    throw v1

    :pswitch_1
    :try_start_2
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->y()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/bu;->d(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$f;->l:Ljava/lang/Object;

    goto :goto_1

    :pswitch_2
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->y()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/bu;->e(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$f;->l:Ljava/lang/Object;

    goto/16 :goto_1

    :pswitch_3
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->y()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/bu;->f(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$f;->l:Ljava/lang/Object;

    goto/16 :goto_1

    :pswitch_4
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->y()Ljava/lang/String;

    move-result-object v0

    const-string v1, "inf"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$f;->l:Ljava/lang/Object;

    goto/16 :goto_1

    :cond_11
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->y()Ljava/lang/String;

    move-result-object v0

    const-string v1, "-inf"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    const/high16 v0, -0x800000    # Float.NEGATIVE_INFINITY

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$f;->l:Ljava/lang/Object;

    goto/16 :goto_1

    :cond_12
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->y()Ljava/lang/String;

    move-result-object v0

    const-string v1, "nan"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    const/high16 v0, 0x7fc00000    # NaNf

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$f;->l:Ljava/lang/Object;

    goto/16 :goto_1

    :cond_13
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->y()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$f;->l:Ljava/lang/Object;

    goto/16 :goto_1

    :pswitch_5
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->y()Ljava/lang/String;

    move-result-object v0

    const-string v1, "inf"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    const-wide/high16 v0, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$f;->l:Ljava/lang/Object;

    goto/16 :goto_1

    :cond_14
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->y()Ljava/lang/String;

    move-result-object v0

    const-string v1, "-inf"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    const-wide/high16 v0, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$f;->l:Ljava/lang/Object;

    goto/16 :goto_1

    :cond_15
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->y()Ljava/lang/String;

    move-result-object v0

    const-string v1, "nan"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    const-wide/high16 v0, 0x7ff8000000000000L    # NaN

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$f;->l:Ljava/lang/Object;

    goto/16 :goto_1

    :cond_16
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->y()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$f;->l:Ljava/lang/Object;

    goto/16 :goto_1

    :pswitch_6
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->y()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$f;->l:Ljava/lang/Object;

    goto/16 :goto_1

    :pswitch_7
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->y()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$f;->l:Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_1

    :pswitch_8
    :try_start_3
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->y()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/bu;->a(Ljava/lang/CharSequence;)Lcom/c/b/f;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$f;->l:Ljava/lang/Object;
    :try_end_3
    .catch Lcom/c/b/bu$b; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_1

    :catch_1
    move-exception v0

    :try_start_4
    new-instance v1, Lcom/c/b/ak$c;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Couldn\'t parse default value: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/c/b/bu$b;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, v0, v3}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;Ljava/lang/Throwable;B)V

    throw v1

    :pswitch_9
    iget-object v0, p0, Lcom/c/b/ak$f;->k:Lcom/c/b/ak$d;

    iget-object v1, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v1}, Lcom/c/b/i$k;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/ak$d;->a(Ljava/lang/String;)Lcom/c/b/ak$e;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$f;->l:Ljava/lang/Object;

    iget-object v0, p0, Lcom/c/b/ak$f;->l:Ljava/lang/Object;

    if-nez v0, :cond_e

    new-instance v0, Lcom/c/b/ak$c;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown enum default value: \""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v2}, Lcom/c/b/i$k;->y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    :pswitch_a
    new-instance v0, Lcom/c/b/ak$c;

    const-string v1, "Message type had default value."

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_0

    :cond_17
    invoke-virtual {p0}, Lcom/c/b/ak$f;->o()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$f;->l:Ljava/lang/Object;

    goto/16 :goto_1

    :cond_18
    sget-object v0, Lcom/c/b/ak$1;->b:[I

    iget-object v1, p0, Lcom/c/b/ak$f;->g:Lcom/c/b/ak$f$b;

    invoke-virtual {v1}, Lcom/c/b/ak$f$b;->a()Lcom/c/b/ak$f$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/c/b/ak$f$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_1

    iget-object v0, p0, Lcom/c/b/ak$f;->g:Lcom/c/b/ak$f$b;

    invoke-virtual {v0}, Lcom/c/b/ak$f$b;->a()Lcom/c/b/ak$f$a;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/ak$f$a;->a(Lcom/c/b/ak$f$a;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$f;->l:Ljava/lang/Object;

    goto/16 :goto_1

    :pswitch_b
    iget-object v0, p0, Lcom/c/b/ak$f;->k:Lcom/c/b/ak$d;

    invoke-virtual {v0}, Lcom/c/b/ak$d;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$f;->l:Ljava/lang/Object;

    goto/16 :goto_1

    :pswitch_c
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/ak$f;->l:Ljava/lang/Object;

    goto/16 :goto_1

    :cond_19
    new-instance v0, Lcom/c/b/ak$c;

    const-string v1, "MessageSets cannot have fields, only extensions."

    invoke-direct {v0, p0, v1, v4}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    :cond_1a
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_a
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_b
        :pswitch_c
    .end packed-switch
.end method

.method static synthetic a(Lcom/c/b/ak$f;Lcom/c/b/i$k;)V
    .locals 0

    .prologue
    .line 866
    iput-object p1, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 874
    iget v0, p0, Lcom/c/b/ak$f;->b:I

    return v0
.end method

.method public final a(Lcom/c/b/be$a;Lcom/c/b/be;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 1419
    check-cast p1, Lcom/c/b/bd$a;

    check-cast p2, Lcom/c/b/bd;

    invoke-interface {p1, p2}, Lcom/c/b/bd$a;->c(Lcom/c/b/bd;)Lcom/c/b/bd$a;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 880
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 889
    iget-object v0, p0, Lcom/c/b/ak$f;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final synthetic compareTo(Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 866
    check-cast p1, Lcom/c/b/ak$f;

    iget-object v0, p1, Lcom/c/b/ak$f;->h:Lcom/c/b/ak$a;

    iget-object v1, p0, Lcom/c/b/ak$f;->h:Lcom/c/b/ak$a;

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->k()I

    move-result v0

    iget-object v1, p1, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v1}, Lcom/c/b/i$k;->k()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final d()Lcom/c/b/ak$g;
    .locals 1

    .prologue
    .line 903
    iget-object v0, p0, Lcom/c/b/ak$f;->e:Lcom/c/b/ak$g;

    return-object v0
.end method

.method public final e()I
    .locals 1

    .prologue
    .line 883
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->k()I

    move-result v0

    return v0
.end method

.method public final f()Lcom/c/b/ak$f$a;
    .locals 1

    .prologue
    .line 895
    iget-object v0, p0, Lcom/c/b/ak$f;->g:Lcom/c/b/ak$f$b;

    invoke-virtual {v0}, Lcom/c/b/ak$f$b;->a()Lcom/c/b/ak$f$a;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lcom/c/b/cd$b;
    .locals 1

    .prologue
    .line 899
    invoke-virtual {p0}, Lcom/c/b/ak$f;->j()Lcom/c/b/cd$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/cd$a;->a()Lcom/c/b/cd$b;

    move-result-object v0

    return-object v0
.end method

.method public final h()Lcom/c/b/ak$f$b;
    .locals 1

    .prologue
    .line 906
    iget-object v0, p0, Lcom/c/b/ak$f;->g:Lcom/c/b/ak$f$b;

    return-object v0
.end method

.method public final bridge synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 866
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    return-object v0
.end method

.method public final j()Lcom/c/b/cd$a;
    .locals 2

    .prologue
    .line 910
    sget-object v0, Lcom/c/b/ak$f;->a:[Lcom/c/b/cd$a;

    iget-object v1, p0, Lcom/c/b/ak$f;->g:Lcom/c/b/ak$f$b;

    invoke-virtual {v1}, Lcom/c/b/ak$f$b;->ordinal()I

    move-result v1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final k()Z
    .locals 2

    .prologue
    .line 915
    iget-object v0, p0, Lcom/c/b/ak$f;->g:Lcom/c/b/ak$f$b;

    sget-object v1, Lcom/c/b/ak$f$b;->i:Lcom/c/b/ak$f$b;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/c/b/ak$f;->e:Lcom/c/b/ak$g;

    invoke-virtual {v0}, Lcom/c/b/ak$g;->f()Lcom/c/b/i$q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$q;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final l()Z
    .locals 2

    .prologue
    .line 919
    iget-object v0, p0, Lcom/c/b/ak$f;->g:Lcom/c/b/ak$f$b;

    sget-object v1, Lcom/c/b/ak$f$b;->k:Lcom/c/b/ak$f$b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/c/b/ak$f;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/c/b/ak$f;->w()Lcom/c/b/ak$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/ak$a;->e()Lcom/c/b/i$s;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$s;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final m()Z
    .locals 2

    .prologue
    .line 931
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->m()Lcom/c/b/i$k$b;

    move-result-object v0

    sget-object v1, Lcom/c/b/i$k$b;->b:Lcom/c/b/i$k$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final n()Z
    .locals 2

    .prologue
    .line 936
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->m()Lcom/c/b/i$k$b;

    move-result-object v0

    sget-object v1, Lcom/c/b/i$k$b;->a:Lcom/c/b/i$k$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final o()Z
    .locals 2

    .prologue
    .line 941
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->m()Lcom/c/b/i$k$b;

    move-result-object v0

    sget-object v1, Lcom/c/b/i$k$b;->c:Lcom/c/b/i$k$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final p()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 948
    invoke-virtual {p0}, Lcom/c/b/ak$f;->q()Z

    move-result v1

    if-nez v1, :cond_1

    .line 954
    :cond_0
    :goto_0
    return v0

    .line 951
    :cond_1
    iget-object v1, p0, Lcom/c/b/ak$f;->e:Lcom/c/b/ak$g;

    invoke-virtual {v1}, Lcom/c/b/ak$g;->k()Lcom/c/b/ak$g$b;

    move-result-object v1

    sget-object v2, Lcom/c/b/ak$g$b;->b:Lcom/c/b/ak$g$b;

    if-ne v1, v2, :cond_2

    .line 952
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->C()Lcom/c/b/i$m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$m;->k()Z

    move-result v0

    goto :goto_0

    .line 954
    :cond_2
    iget-object v1, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v1}, Lcom/c/b/i$k;->C()Lcom/c/b/i$m;

    move-result-object v1

    invoke-virtual {v1}, Lcom/c/b/i$m;->j()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v1}, Lcom/c/b/i$k;->C()Lcom/c/b/i$m;

    move-result-object v1

    invoke-virtual {v1}, Lcom/c/b/i$m;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_3
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final q()Z
    .locals 1

    .prologue
    .line 960
    invoke-virtual {p0}, Lcom/c/b/ak$f;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/c/b/ak$f;->j()Lcom/c/b/cd$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/cd$a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final r()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 972
    iget-object v0, p0, Lcom/c/b/ak$f;->g:Lcom/c/b/ak$f$b;

    invoke-virtual {v0}, Lcom/c/b/ak$f$b;->a()Lcom/c/b/ak$f$a;

    move-result-object v0

    sget-object v1, Lcom/c/b/ak$f$a;->i:Lcom/c/b/ak$f$a;

    if-ne v0, v1, :cond_0

    .line 973
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "FieldDescriptor.getDefaultValue() called on an embedded message field."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 977
    :cond_0
    iget-object v0, p0, Lcom/c/b/ak$f;->l:Ljava/lang/Object;

    return-object v0
.end method

.method public final s()Z
    .locals 1

    .prologue
    .line 984
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->r()Z

    move-result v0

    return v0
.end method

.method public final t()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 991
    iget-object v0, p0, Lcom/c/b/ak$f;->h:Lcom/c/b/ak$a;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1064
    iget-object v0, p0, Lcom/c/b/ak$f;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final u()Lcom/c/b/ak$j;
    .locals 1

    .prologue
    .line 994
    iget-object v0, p0, Lcom/c/b/ak$f;->j:Lcom/c/b/ak$j;

    return-object v0
.end method

.method public final v()Lcom/c/b/ak$a;
    .locals 2

    .prologue
    .line 1018
    iget-object v0, p0, Lcom/c/b/ak$f;->c:Lcom/c/b/i$k;

    invoke-virtual {v0}, Lcom/c/b/i$k;->r()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1019
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This field is not an extension."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1022
    :cond_0
    iget-object v0, p0, Lcom/c/b/ak$f;->f:Lcom/c/b/ak$a;

    return-object v0
.end method

.method public final w()Lcom/c/b/ak$a;
    .locals 2

    .prologue
    .line 1027
    iget-object v0, p0, Lcom/c/b/ak$f;->g:Lcom/c/b/ak$f$b;

    invoke-virtual {v0}, Lcom/c/b/ak$f$b;->a()Lcom/c/b/ak$f$a;

    move-result-object v0

    sget-object v1, Lcom/c/b/ak$f$a;->i:Lcom/c/b/ak$f$a;

    if-eq v0, v1, :cond_0

    .line 1028
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This field is not of message type."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1031
    :cond_0
    iget-object v0, p0, Lcom/c/b/ak$f;->i:Lcom/c/b/ak$a;

    return-object v0
.end method

.method public final x()Lcom/c/b/ak$d;
    .locals 2

    .prologue
    .line 1036
    iget-object v0, p0, Lcom/c/b/ak$f;->g:Lcom/c/b/ak$f$b;

    invoke-virtual {v0}, Lcom/c/b/ak$f$b;->a()Lcom/c/b/ak$f$a;

    move-result-object v0

    sget-object v1, Lcom/c/b/ak$f$a;->h:Lcom/c/b/ak$f$a;

    if-eq v0, v1, :cond_0

    .line 1037
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This field is not of enum type."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1040
    :cond_0
    iget-object v0, p0, Lcom/c/b/ak$f;->k:Lcom/c/b/ak$d;

    return-object v0
.end method
