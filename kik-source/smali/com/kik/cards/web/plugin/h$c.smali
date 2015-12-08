.class final Lcom/kik/cards/web/plugin/h$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/cards/web/plugin/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private a:Ljava/lang/reflect/Method;

.field private b:Lcom/kik/cards/web/plugin/d;

.field private c:Ljava/lang/String;

.field private d:Z


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Lcom/kik/cards/web/plugin/d;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p1, p0, Lcom/kik/cards/web/plugin/h$c;->a:Ljava/lang/reflect/Method;

    .line 84
    iput-object p2, p0, Lcom/kik/cards/web/plugin/h$c;->b:Lcom/kik/cards/web/plugin/d;

    .line 85
    iput-object p3, p0, Lcom/kik/cards/web/plugin/h$c;->c:Ljava/lang/String;

    .line 86
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cards/web/plugin/h$c;->d:Z

    .line 87
    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Method;Lcom/kik/cards/web/plugin/d;Ljava/lang/String;B)V
    .locals 1

    .prologue
    .line 91
    invoke-direct {p0, p1, p2, p3}, Lcom/kik/cards/web/plugin/h$c;-><init>(Ljava/lang/reflect/Method;Lcom/kik/cards/web/plugin/d;Ljava/lang/String;)V

    .line 92
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/cards/web/plugin/h$c;->d:Z

    .line 93
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/reflect/Method;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/kik/cards/web/plugin/h$c;->a:Ljava/lang/reflect/Method;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/kik/cards/web/plugin/h$c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Lcom/kik/cards/web/plugin/d;
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lcom/kik/cards/web/plugin/h$c;->b:Lcom/kik/cards/web/plugin/d;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 112
    iget-boolean v0, p0, Lcom/kik/cards/web/plugin/h$c;->d:Z

    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 4

    .prologue
    .line 117
    const-string v0, "%s.%s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/kik/cards/web/plugin/h$c;->b:Lcom/kik/cards/web/plugin/d;

    invoke-virtual {v3}, Lcom/kik/cards/web/plugin/d;->f()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/kik/cards/web/plugin/h$c;->c:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
