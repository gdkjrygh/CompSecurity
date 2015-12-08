.class public final Lcom/kik/n/a/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/n;
.implements Ljava/io/Externalizable;


# static fields
.field static final a:Lcom/kik/n/a/a/a;

.field static final b:Lcom/b/a/u;


# instance fields
.field c:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    new-instance v0, Lcom/kik/n/a/a/a;

    invoke-direct {v0}, Lcom/kik/n/a/a/a;-><init>()V

    sput-object v0, Lcom/kik/n/a/a/a;->a:Lcom/kik/n/a/a/a;

    .line 21
    new-instance v0, Lcom/kik/n/a/a/b;

    invoke-direct {v0}, Lcom/kik/n/a/a/b;-><init>()V

    sput-object v0, Lcom/kik/n/a/a/a;->b:Lcom/b/a/u;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    return-void
.end method


# virtual methods
.method public final a()Lcom/b/a/u;
    .locals 1

    .prologue
    .line 145
    sget-object v0, Lcom/kik/n/a/a/a;->b:Lcom/b/a/u;

    return-object v0
.end method

.method public final a(Ljava/lang/Boolean;)Lcom/kik/n/a/a/a;
    .locals 0

    .prologue
    .line 127
    iput-object p1, p0, Lcom/kik/n/a/a/a;->c:Ljava/lang/Boolean;

    .line 128
    return-object p0
.end method

.method public final b()Ljava/lang/Boolean;
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/kik/n/a/a/a;->c:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    .prologue
    .line 133
    sget-object v0, Lcom/kik/n/a/a/a;->b:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataInput;Ljava/lang/Object;Lcom/b/a/u;)V

    .line 134
    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .prologue
    .line 140
    sget-object v0, Lcom/kik/n/a/a/a;->b:Lcom/b/a/u;

    invoke-static {p1, p0, v0}, Lcom/b/a/h;->a(Ljava/io/DataOutput;Ljava/lang/Object;Lcom/b/a/u;)I

    .line 141
    return-void
.end method
