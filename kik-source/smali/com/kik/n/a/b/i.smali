.class public final Lcom/kik/n/a/b/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/n;
.implements Ljava/io/Externalizable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/n/a/b/i$a;,
        Lcom/kik/n/a/b/i$b;
    }
.end annotation


# static fields
.field static final a:Lcom/kik/n/a/b/i;

.field static final d:Lcom/b/a/u;


# instance fields
.field b:Lcom/kik/n/a/b/i$a;

.field c:Lcom/kik/n/a/b/i$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 87
    new-instance v0, Lcom/kik/n/a/b/i;

    invoke-direct {v0}, Lcom/kik/n/a/b/i;-><init>()V

    sput-object v0, Lcom/kik/n/a/b/i;->a:Lcom/kik/n/a/b/i;

    .line 147
    new-instance v0, Lcom/kik/n/a/b/j;

    invoke-direct {v0}, Lcom/kik/n/a/b/j;-><init>()V

    sput-object v0, Lcom/kik/n/a/b/i;->d:Lcom/b/a/u;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    return-void
.end method

.method public static b()Lcom/b/a/u;
    .locals 1

    .prologue
    .line 79
    sget-object v0, Lcom/kik/n/a/b/i;->d:Lcom/b/a/u;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/b/a/u;
    .locals 1

    .prologue
    .line 144
    sget-object v0, Lcom/kik/n/a/b/i;->d:Lcom/b/a/u;

    return-object v0
.end method

.method public final a(Lcom/kik/n/a/b/i$a;)Lcom/kik/n/a/b/i;
    .locals 0

    .prologue
    .line 111
    iput-object p1, p0, Lcom/kik/n/a/b/i;->b:Lcom/kik/n/a/b/i$a;

    .line 112
    return-object p0
.end method

.method public final a(Lcom/kik/n/a/b/i$b;)Lcom/kik/n/a/b/i;
    .locals 0

    .prologue
    .line 124
    iput-object p1, p0, Lcom/kik/n/a/b/i;->c:Lcom/kik/n/a/b/i$b;

    .line 125
    return-object p0
.end method

.method public final c()Lcom/kik/n/a/b/i$a;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/kik/n/a/b/i;->b:Lcom/kik/n/a/b/i$a;

    if-nez v0, :cond_0

    sget-object v0, Lcom/kik/n/a/b/i$a;->a:Lcom/kik/n/a/b/i$a;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/kik/n/a/b/i;->b:Lcom/kik/n/a/b/i$a;

    goto :goto_0
.end method

.method public final d()Lcom/kik/n/a/b/i$b;
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lcom/kik/n/a/b/i;->c:Lcom/kik/n/a/b/i$b;

    if-nez v0, :cond_0

    sget-object v0, Lcom/kik/n/a/b/i$b;->a:Lcom/kik/n/a/b/i$b;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/kik/n/a/b/i;->c:Lcom/kik/n/a/b/i$b;

    goto :goto_0
.end method

.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    .prologue
    .line 132
    sget-object v0, Lcom/kik/n/a/b/i;->d:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataInput;Ljava/lang/Object;Lcom/b/a/u;)V

    .line 133
    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .prologue
    .line 137
    sget-object v0, Lcom/kik/n/a/b/i;->d:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataOutput;Ljava/lang/Object;Lcom/b/a/u;)I

    .line 138
    return-void
.end method
