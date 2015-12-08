.class public interface abstract Lau/com/bytecode/opencsv/ResultSetHelper;
.super Ljava/lang/Object;


# virtual methods
.method public abstract getColumnNames(Ljava/sql/ResultSet;)[Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation
.end method

.method public abstract getColumnValues(Ljava/sql/ResultSet;)[Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method
