.class public final Lcom/kik/k/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/k/a$a;,
        Lcom/kik/k/a$b;
    }
.end annotation


# static fields
.field public static final a:Lcom/c/b/as$h;

.field private static b:Lcom/c/b/ak$a;

.field private static c:Lcom/c/b/as$g;

.field private static d:Lcom/c/b/ak$g;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 1110
    const-class v0, Lcom/kik/k/a$a;

    invoke-static {}, Lcom/kik/k/a$a;->A()Lcom/kik/k/a$a;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/c/b/as;->a(Ljava/lang/Class;Lcom/c/b/bd;)Lcom/c/b/as$h;

    move-result-object v0

    sput-object v0, Lcom/kik/k/a;->a:Lcom/c/b/as$h;

    .line 1127
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "\n\u0019protobuf_validation.proto\u0012\u000ekik.validation\u001a google/protobuf/descriptor.proto\"\u00c0\u0001\n\u000fFieldValidation\u0012\u0018\n\tmandatory\u0018\u0001 \u0001(\u0008:\u0005false\u0012\r\n\u0005regex\u0018\u0002 \u0001(\t\u0012\u0017\n\u000fmin_byte_length\u0018\u0005 \u0001(\u0005\u0012\u0017\n\u000fmax_byte_length\u0018\u0006 \u0001(\u0005\u0012\u000f\n\u0007min_val\u0018\u0007 \u0001(\u0010\u0012\u000f\n\u0007max_val\u0018\u0008 \u0001(\u0010\u0012\u0017\n\u000fmin_repetitions\u0018\u000f \u0001(\r\u0012\u0017\n\u000fmax_repetitions\u0018\u0010 \u0001(\r:Z\n\u0010field_validation\u0012\u001d.google.protobuf.FieldOptions\u0018\u00d9\u00d3\u0004 \u0001(\u000b2\u001f.kik.validation.FieldValidationB\u0019\n\u0017com.kik.protovalidation"

    aput-object v1, v0, v5

    .line 1139
    new-instance v1, Lcom/kik/k/b;

    invoke-direct {v1}, Lcom/kik/k/b;-><init>()V

    .line 1147
    new-array v2, v4, [Lcom/c/b/ak$g;

    invoke-static {}, Lcom/c/b/i;->a()Lcom/c/b/ak$g;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-static {v0, v2, v1}, Lcom/c/b/ak$g;->a([Ljava/lang/String;[Lcom/c/b/ak$g;Lcom/c/b/ak$g$a;)V

    .line 1152
    sget-object v0, Lcom/kik/k/a;->d:Lcom/c/b/ak$g;

    invoke-virtual {v0}, Lcom/c/b/ak$g;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$a;

    sput-object v0, Lcom/kik/k/a;->b:Lcom/c/b/ak$a;

    .line 1154
    new-instance v0, Lcom/c/b/as$g;

    sget-object v1, Lcom/kik/k/a;->b:Lcom/c/b/ak$a;

    const/16 v2, 0x8

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "Mandatory"

    aput-object v3, v2, v5

    const-string v3, "Regex"

    aput-object v3, v2, v4

    const/4 v3, 0x2

    const-string v4, "MinByteLength"

    aput-object v4, v2, v3

    const/4 v3, 0x3

    const-string v4, "MaxByteLength"

    aput-object v4, v2, v3

    const/4 v3, 0x4

    const-string v4, "MinVal"

    aput-object v4, v2, v3

    const/4 v3, 0x5

    const-string v4, "MaxVal"

    aput-object v4, v2, v3

    const/4 v3, 0x6

    const-string v4, "MinRepetitions"

    aput-object v4, v2, v3

    const/4 v3, 0x7

    const-string v4, "MaxRepetitions"

    aput-object v4, v2, v3

    invoke-direct {v0, v1, v2}, Lcom/c/b/as$g;-><init>(Lcom/c/b/ak$a;[Ljava/lang/String;)V

    sput-object v0, Lcom/kik/k/a;->c:Lcom/c/b/as$g;

    .line 1158
    sget-object v1, Lcom/kik/k/a;->a:Lcom/c/b/as$h;

    sget-object v0, Lcom/kik/k/a;->d:Lcom/c/b/ak$g;

    invoke-virtual {v0}, Lcom/c/b/ak$g;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$f;

    invoke-virtual {v1, v0}, Lcom/c/b/as$h;->a(Lcom/c/b/ak$f;)V

    .line 1159
    invoke-static {}, Lcom/c/b/i;->a()Lcom/c/b/ak$g;

    .line 1160
    return-void
.end method

.method public static a()Lcom/c/b/ak$g;
    .locals 1

    .prologue
    .line 1122
    sget-object v0, Lcom/kik/k/a;->d:Lcom/c/b/ak$g;

    return-object v0
.end method

.method static synthetic a(Lcom/c/b/ak$g;)Lcom/c/b/ak$g;
    .locals 0

    .prologue
    .line 6
    sput-object p0, Lcom/kik/k/a;->d:Lcom/c/b/ak$g;

    return-object p0
.end method

.method static synthetic b()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 6
    sget-object v0, Lcom/kik/k/a;->b:Lcom/c/b/ak$a;

    return-object v0
.end method

.method static synthetic c()Lcom/c/b/as$g;
    .locals 1

    .prologue
    .line 6
    sget-object v0, Lcom/kik/k/a;->c:Lcom/c/b/as$g;

    return-object v0
.end method
