.class public enum Lcom/c/b/cd$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/cd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = "a"
.end annotation


# static fields
.field public static final enum a:Lcom/c/b/cd$a;

.field public static final enum b:Lcom/c/b/cd$a;

.field public static final enum c:Lcom/c/b/cd$a;

.field public static final enum d:Lcom/c/b/cd$a;

.field public static final enum e:Lcom/c/b/cd$a;

.field public static final enum f:Lcom/c/b/cd$a;

.field public static final enum g:Lcom/c/b/cd$a;

.field public static final enum h:Lcom/c/b/cd$a;

.field public static final enum i:Lcom/c/b/cd$a;

.field public static final enum j:Lcom/c/b/cd$a;

.field public static final enum k:Lcom/c/b/cd$a;

.field public static final enum l:Lcom/c/b/cd$a;

.field public static final enum m:Lcom/c/b/cd$a;

.field public static final enum n:Lcom/c/b/cd$a;

.field public static final enum o:Lcom/c/b/cd$a;

.field public static final enum p:Lcom/c/b/cd$a;

.field public static final enum q:Lcom/c/b/cd$a;

.field public static final enum r:Lcom/c/b/cd$a;

.field private static final synthetic u:[Lcom/c/b/cd$a;


# instance fields
.field private final s:Lcom/c/b/cd$b;

.field private final t:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x3

    const/4 v7, 0x2

    const/4 v6, 0x5

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 110
    new-instance v0, Lcom/c/b/cd$a;

    const-string v1, "DOUBLE"

    sget-object v2, Lcom/c/b/cd$b;->d:Lcom/c/b/cd$b;

    invoke-direct {v0, v1, v4, v2, v5}, Lcom/c/b/cd$a;-><init>(Ljava/lang/String;ILcom/c/b/cd$b;I)V

    sput-object v0, Lcom/c/b/cd$a;->a:Lcom/c/b/cd$a;

    .line 111
    new-instance v0, Lcom/c/b/cd$a;

    const-string v1, "FLOAT"

    sget-object v2, Lcom/c/b/cd$b;->c:Lcom/c/b/cd$b;

    invoke-direct {v0, v1, v5, v2, v6}, Lcom/c/b/cd$a;-><init>(Ljava/lang/String;ILcom/c/b/cd$b;I)V

    sput-object v0, Lcom/c/b/cd$a;->b:Lcom/c/b/cd$a;

    .line 112
    new-instance v0, Lcom/c/b/cd$a;

    const-string v1, "INT64"

    sget-object v2, Lcom/c/b/cd$b;->b:Lcom/c/b/cd$b;

    invoke-direct {v0, v1, v7, v2, v4}, Lcom/c/b/cd$a;-><init>(Ljava/lang/String;ILcom/c/b/cd$b;I)V

    sput-object v0, Lcom/c/b/cd$a;->c:Lcom/c/b/cd$a;

    .line 113
    new-instance v0, Lcom/c/b/cd$a;

    const-string v1, "UINT64"

    sget-object v2, Lcom/c/b/cd$b;->b:Lcom/c/b/cd$b;

    invoke-direct {v0, v1, v8, v2, v4}, Lcom/c/b/cd$a;-><init>(Ljava/lang/String;ILcom/c/b/cd$b;I)V

    sput-object v0, Lcom/c/b/cd$a;->d:Lcom/c/b/cd$a;

    .line 114
    new-instance v0, Lcom/c/b/cd$a;

    const-string v1, "INT32"

    const/4 v2, 0x4

    sget-object v3, Lcom/c/b/cd$b;->a:Lcom/c/b/cd$b;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/c/b/cd$a;-><init>(Ljava/lang/String;ILcom/c/b/cd$b;I)V

    sput-object v0, Lcom/c/b/cd$a;->e:Lcom/c/b/cd$a;

    .line 115
    new-instance v0, Lcom/c/b/cd$a;

    const-string v1, "FIXED64"

    sget-object v2, Lcom/c/b/cd$b;->b:Lcom/c/b/cd$b;

    invoke-direct {v0, v1, v6, v2, v5}, Lcom/c/b/cd$a;-><init>(Ljava/lang/String;ILcom/c/b/cd$b;I)V

    sput-object v0, Lcom/c/b/cd$a;->f:Lcom/c/b/cd$a;

    .line 116
    new-instance v0, Lcom/c/b/cd$a;

    const-string v1, "FIXED32"

    const/4 v2, 0x6

    sget-object v3, Lcom/c/b/cd$b;->a:Lcom/c/b/cd$b;

    invoke-direct {v0, v1, v2, v3, v6}, Lcom/c/b/cd$a;-><init>(Ljava/lang/String;ILcom/c/b/cd$b;I)V

    sput-object v0, Lcom/c/b/cd$a;->g:Lcom/c/b/cd$a;

    .line 117
    new-instance v0, Lcom/c/b/cd$a;

    const-string v1, "BOOL"

    const/4 v2, 0x7

    sget-object v3, Lcom/c/b/cd$b;->e:Lcom/c/b/cd$b;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/c/b/cd$a;-><init>(Ljava/lang/String;ILcom/c/b/cd$b;I)V

    sput-object v0, Lcom/c/b/cd$a;->h:Lcom/c/b/cd$a;

    .line 118
    new-instance v0, Lcom/c/b/ce;

    const-string v1, "STRING"

    sget-object v2, Lcom/c/b/cd$b;->f:Lcom/c/b/cd$b;

    invoke-direct {v0, v1, v2}, Lcom/c/b/ce;-><init>(Ljava/lang/String;Lcom/c/b/cd$b;)V

    sput-object v0, Lcom/c/b/cd$a;->i:Lcom/c/b/cd$a;

    .line 121
    new-instance v0, Lcom/c/b/cf;

    const-string v1, "GROUP"

    sget-object v2, Lcom/c/b/cd$b;->i:Lcom/c/b/cd$b;

    invoke-direct {v0, v1, v2}, Lcom/c/b/cf;-><init>(Ljava/lang/String;Lcom/c/b/cd$b;)V

    sput-object v0, Lcom/c/b/cd$a;->j:Lcom/c/b/cd$a;

    .line 124
    new-instance v0, Lcom/c/b/cg;

    const-string v1, "MESSAGE"

    sget-object v2, Lcom/c/b/cd$b;->i:Lcom/c/b/cd$b;

    invoke-direct {v0, v1, v2}, Lcom/c/b/cg;-><init>(Ljava/lang/String;Lcom/c/b/cd$b;)V

    sput-object v0, Lcom/c/b/cd$a;->k:Lcom/c/b/cd$a;

    .line 127
    new-instance v0, Lcom/c/b/ch;

    const-string v1, "BYTES"

    sget-object v2, Lcom/c/b/cd$b;->g:Lcom/c/b/cd$b;

    invoke-direct {v0, v1, v2}, Lcom/c/b/ch;-><init>(Ljava/lang/String;Lcom/c/b/cd$b;)V

    sput-object v0, Lcom/c/b/cd$a;->l:Lcom/c/b/cd$a;

    .line 130
    new-instance v0, Lcom/c/b/cd$a;

    const-string v1, "UINT32"

    const/16 v2, 0xc

    sget-object v3, Lcom/c/b/cd$b;->a:Lcom/c/b/cd$b;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/c/b/cd$a;-><init>(Ljava/lang/String;ILcom/c/b/cd$b;I)V

    sput-object v0, Lcom/c/b/cd$a;->m:Lcom/c/b/cd$a;

    .line 131
    new-instance v0, Lcom/c/b/cd$a;

    const-string v1, "ENUM"

    const/16 v2, 0xd

    sget-object v3, Lcom/c/b/cd$b;->h:Lcom/c/b/cd$b;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/c/b/cd$a;-><init>(Ljava/lang/String;ILcom/c/b/cd$b;I)V

    sput-object v0, Lcom/c/b/cd$a;->n:Lcom/c/b/cd$a;

    .line 132
    new-instance v0, Lcom/c/b/cd$a;

    const-string v1, "SFIXED32"

    const/16 v2, 0xe

    sget-object v3, Lcom/c/b/cd$b;->a:Lcom/c/b/cd$b;

    invoke-direct {v0, v1, v2, v3, v6}, Lcom/c/b/cd$a;-><init>(Ljava/lang/String;ILcom/c/b/cd$b;I)V

    sput-object v0, Lcom/c/b/cd$a;->o:Lcom/c/b/cd$a;

    .line 133
    new-instance v0, Lcom/c/b/cd$a;

    const-string v1, "SFIXED64"

    const/16 v2, 0xf

    sget-object v3, Lcom/c/b/cd$b;->b:Lcom/c/b/cd$b;

    invoke-direct {v0, v1, v2, v3, v5}, Lcom/c/b/cd$a;-><init>(Ljava/lang/String;ILcom/c/b/cd$b;I)V

    sput-object v0, Lcom/c/b/cd$a;->p:Lcom/c/b/cd$a;

    .line 134
    new-instance v0, Lcom/c/b/cd$a;

    const-string v1, "SINT32"

    const/16 v2, 0x10

    sget-object v3, Lcom/c/b/cd$b;->a:Lcom/c/b/cd$b;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/c/b/cd$a;-><init>(Ljava/lang/String;ILcom/c/b/cd$b;I)V

    sput-object v0, Lcom/c/b/cd$a;->q:Lcom/c/b/cd$a;

    .line 135
    new-instance v0, Lcom/c/b/cd$a;

    const-string v1, "SINT64"

    const/16 v2, 0x11

    sget-object v3, Lcom/c/b/cd$b;->b:Lcom/c/b/cd$b;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/c/b/cd$a;-><init>(Ljava/lang/String;ILcom/c/b/cd$b;I)V

    sput-object v0, Lcom/c/b/cd$a;->r:Lcom/c/b/cd$a;

    .line 109
    const/16 v0, 0x12

    new-array v0, v0, [Lcom/c/b/cd$a;

    sget-object v1, Lcom/c/b/cd$a;->a:Lcom/c/b/cd$a;

    aput-object v1, v0, v4

    sget-object v1, Lcom/c/b/cd$a;->b:Lcom/c/b/cd$a;

    aput-object v1, v0, v5

    sget-object v1, Lcom/c/b/cd$a;->c:Lcom/c/b/cd$a;

    aput-object v1, v0, v7

    sget-object v1, Lcom/c/b/cd$a;->d:Lcom/c/b/cd$a;

    aput-object v1, v0, v8

    const/4 v1, 0x4

    sget-object v2, Lcom/c/b/cd$a;->e:Lcom/c/b/cd$a;

    aput-object v2, v0, v1

    sget-object v1, Lcom/c/b/cd$a;->f:Lcom/c/b/cd$a;

    aput-object v1, v0, v6

    const/4 v1, 0x6

    sget-object v2, Lcom/c/b/cd$a;->g:Lcom/c/b/cd$a;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/c/b/cd$a;->h:Lcom/c/b/cd$a;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/c/b/cd$a;->i:Lcom/c/b/cd$a;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/c/b/cd$a;->j:Lcom/c/b/cd$a;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/c/b/cd$a;->k:Lcom/c/b/cd$a;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/c/b/cd$a;->l:Lcom/c/b/cd$a;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/c/b/cd$a;->m:Lcom/c/b/cd$a;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/c/b/cd$a;->n:Lcom/c/b/cd$a;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lcom/c/b/cd$a;->o:Lcom/c/b/cd$a;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lcom/c/b/cd$a;->p:Lcom/c/b/cd$a;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lcom/c/b/cd$a;->q:Lcom/c/b/cd$a;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, Lcom/c/b/cd$a;->r:Lcom/c/b/cd$a;

    aput-object v2, v0, v1

    sput-object v0, Lcom/c/b/cd$a;->u:[Lcom/c/b/cd$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILcom/c/b/cd$b;I)V
    .locals 0

    .prologue
    .line 137
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 138
    iput-object p3, p0, Lcom/c/b/cd$a;->s:Lcom/c/b/cd$b;

    .line 139
    iput p4, p0, Lcom/c/b/cd$a;->t:I

    .line 140
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/c/b/cd$b;IB)V
    .locals 0

    .prologue
    .line 109
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/c/b/cd$a;-><init>(Ljava/lang/String;ILcom/c/b/cd$b;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/c/b/cd$a;
    .locals 1

    .prologue
    .line 109
    const-class v0, Lcom/c/b/cd$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/c/b/cd$a;

    return-object v0
.end method

.method public static values()[Lcom/c/b/cd$a;
    .locals 1

    .prologue
    .line 109
    sget-object v0, Lcom/c/b/cd$a;->u:[Lcom/c/b/cd$a;

    invoke-virtual {v0}, [Lcom/c/b/cd$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/c/b/cd$a;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/c/b/cd$b;
    .locals 1

    .prologue
    .line 145
    iget-object v0, p0, Lcom/c/b/cd$a;->s:Lcom/c/b/cd$b;

    return-object v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 146
    iget v0, p0, Lcom/c/b/cd$a;->t:I

    return v0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 148
    const/4 v0, 0x1

    return v0
.end method
