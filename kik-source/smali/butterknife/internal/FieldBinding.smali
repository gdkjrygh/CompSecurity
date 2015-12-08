.class final Lbutterknife/internal/FieldBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbutterknife/internal/Binding;


# instance fields
.field private final name:Ljava/lang/String;

.field private final required:Z

.field private final type:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lbutterknife/internal/FieldBinding;->name:Ljava/lang/String;

    .line 10
    iput-object p2, p0, Lbutterknife/internal/FieldBinding;->type:Ljava/lang/String;

    .line 11
    iput-boolean p3, p0, Lbutterknife/internal/FieldBinding;->required:Z

    .line 12
    return-void
.end method


# virtual methods
.method public final getDescription()Ljava/lang/String;
    .locals 2

    .prologue
    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "field \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lbutterknife/internal/FieldBinding;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lbutterknife/internal/FieldBinding;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lbutterknife/internal/FieldBinding;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final isRequired()Z
    .locals 1

    .prologue
    .line 27
    iget-boolean v0, p0, Lbutterknife/internal/FieldBinding;->required:Z

    return v0
.end method
