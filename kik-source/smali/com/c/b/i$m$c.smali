.class public final enum Lcom/c/b/i$m$c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/bl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field public static final enum a:Lcom/c/b/i$m$c;

.field public static final enum b:Lcom/c/b/i$m$c;

.field public static final enum c:Lcom/c/b/i$m$c;

.field private static d:Lcom/c/b/au$b;

.field private static final e:[Lcom/c/b/i$m$c;

.field private static final synthetic h:[Lcom/c/b/i$m$c;


# instance fields
.field private final f:I

.field private final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 21122
    new-instance v0, Lcom/c/b/i$m$c;

    const-string v1, "JS_NORMAL"

    invoke-direct {v0, v1, v2, v2, v2}, Lcom/c/b/i$m$c;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/c/b/i$m$c;->a:Lcom/c/b/i$m$c;

    .line 21130
    new-instance v0, Lcom/c/b/i$m$c;

    const-string v1, "JS_STRING"

    invoke-direct {v0, v1, v3, v3, v3}, Lcom/c/b/i$m$c;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/c/b/i$m$c;->b:Lcom/c/b/i$m$c;

    .line 21138
    new-instance v0, Lcom/c/b/i$m$c;

    const-string v1, "JS_NUMBER"

    invoke-direct {v0, v1, v4, v4, v4}, Lcom/c/b/i$m$c;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/c/b/i$m$c;->c:Lcom/c/b/i$m$c;

    .line 21113
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/c/b/i$m$c;

    sget-object v1, Lcom/c/b/i$m$c;->a:Lcom/c/b/i$m$c;

    aput-object v1, v0, v2

    sget-object v1, Lcom/c/b/i$m$c;->b:Lcom/c/b/i$m$c;

    aput-object v1, v0, v3

    sget-object v1, Lcom/c/b/i$m$c;->c:Lcom/c/b/i$m$c;

    aput-object v1, v0, v4

    sput-object v0, Lcom/c/b/i$m$c;->h:[Lcom/c/b/i$m$c;

    .line 21185
    new-instance v0, Lcom/c/b/w;

    invoke-direct {v0}, Lcom/c/b/w;-><init>()V

    sput-object v0, Lcom/c/b/i$m$c;->d:Lcom/c/b/au$b;

    .line 21205
    invoke-static {}, Lcom/c/b/i$m$c;->values()[Lcom/c/b/i$m$c;

    move-result-object v0

    sput-object v0, Lcom/c/b/i$m$c;->e:[Lcom/c/b/i$m$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0

    .prologue
    .line 21219
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 21220
    iput p3, p0, Lcom/c/b/i$m$c;->f:I

    .line 21221
    iput p4, p0, Lcom/c/b/i$m$c;->g:I

    .line 21222
    return-void
.end method

.method public static a(I)Lcom/c/b/i$m$c;
    .locals 1

    .prologue
    .line 21172
    packed-switch p0, :pswitch_data_0

    .line 21176
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 21173
    :pswitch_0
    sget-object v0, Lcom/c/b/i$m$c;->a:Lcom/c/b/i$m$c;

    goto :goto_0

    .line 21174
    :pswitch_1
    sget-object v0, Lcom/c/b/i$m$c;->b:Lcom/c/b/i$m$c;

    goto :goto_0

    .line 21175
    :pswitch_2
    sget-object v0, Lcom/c/b/i$m$c;->c:Lcom/c/b/i$m$c;

    goto :goto_0

    .line 21172
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/c/b/i$m$c;
    .locals 1

    .prologue
    .line 21113
    const-class v0, Lcom/c/b/i$m$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$m$c;

    return-object v0
.end method

.method public static values()[Lcom/c/b/i$m$c;
    .locals 1

    .prologue
    .line 21113
    sget-object v0, Lcom/c/b/i$m$c;->h:[Lcom/c/b/i$m$c;

    invoke-virtual {v0}, [Lcom/c/b/i$m$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/c/b/i$m$c;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 21168
    iget v0, p0, Lcom/c/b/i$m$c;->g:I

    return v0
.end method
